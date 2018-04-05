package oracle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestSubArray {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter length of the list: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        int[] list = new int[number];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < number; i++) {
            list[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int maxSum = findLargestSubArray(list);
        System.out.println(maxSum);
    }

    private static int findLargestSubArray(int[] list) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
            for (int j = i + 1; j < list.length; j++) {
                sum += list[j];
                if (max < sum) {
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }
}
