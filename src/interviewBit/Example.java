package interviewBit;

public class Example {
    public static void main(String[] args) {
        int[] array = new int[7];
        for (int i = 0; i < 7; i++) {     // fill array
            array[i] = i;
        }
        int[] randomArray = {0,0,0,0,0,2,0};
        for (int i = 0; i < 7; i++) {    // shuffle array
            printArray(array);
            System.out.println(array[i] + " " + i + " " + array[randomArray[i]] + "  " +randomArray[i]);
            int temp = array[i];
//            int randomIndex = (int)(Math.random()) * 7;
            int randomIndex = randomArray[i];
            array[i]= array[randomIndex];
            array[randomIndex] = temp;
            printArray(array);
            System.out.println("---------");
        }


        for (int i = 0; i < 7; i++) {    // print array
            System.out.println(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
