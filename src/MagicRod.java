import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;

public class MagicRod {
    static int count = 0;
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        int[] arrayOfWeights = {20, 4, 50, 10, 100};
        int marginOfError = 20;
        System.out.println(magicRod(arrayOfWeights, marginOfError));
//        System.out.println(findMin(arrayOfWeights, 5));

        for(int i = 0; i< arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

    private static String magicRod(int[] arrayOfWeights, int marginOfError) {
        int[] sortedArray = sort(arrayOfWeights);
        if (sortedArray.length % 2 == 0) {
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if ((sortedArray[i + 1] - sortedArray[i]) > marginOfError) {
                    int minimumWeight = findMin(sortedArray, sortedArray.length);
                    return finalOutput(minimumWeight, marginOfError);
                }
            }
            return "perfectly Balanced";
        }
        int minimumWeight = findMin(arrayOfWeights, arrayOfWeights.length);
//        System.out.println("*******" + minimumWeight);
        return finalOutput(minimumWeight, marginOfError);
    }


    static String finalOutput(int minimumWeight, int marginOfError) {
        System.out.println(minimumWeight + " ** " + marginOfError + "** " + count);
        if (minimumWeight == marginOfError) {
            return "perfectly Balanced";
        } else if (minimumWeight > marginOfError) {
            return "not Balanced";
        }
        System.out.println("sdome");
        return "Balanced";
    }

    static int findMinRec(int arr[], int i, int sumCalculated, int sumTotal) {

        if (i == 0)
            return Math.abs((sumTotal - sumCalculated) - sumCalculated);

        count++;
        arrayList.add(arr[i - 1]);
        return Math.min(findMinRec(arr, i - 1, sumCalculated + arr[i - 1], sumTotal),
                findMinRec(arr, i - 1, sumCalculated, sumTotal));
    }

    static int findMin(int arr[], int n) {
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];

        return findMinRec(arr, n, 0, sumTotal);
    }

    private static int[] sort(int[] arrayOfWeights) {
        for (int i = 0; i < arrayOfWeights.length; i++) {
            for (int j = i + 1; j < arrayOfWeights.length; j++) {
                if (arrayOfWeights[j] < arrayOfWeights[i]) {
                    int temp = arrayOfWeights[i];
                    arrayOfWeights[i] = arrayOfWeights[j];
                    arrayOfWeights[j] = temp;
                }
            }
        }
        return arrayOfWeights;
    }
}
