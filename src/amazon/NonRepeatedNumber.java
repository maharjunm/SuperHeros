package amazon;

import java.util.Scanner;

public class NonRepeatedNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(findElement(array));
    }

    private static int findElement(int[] array) {
        int INT_SIZE = 32;
        int result = 0;
        int sum;
        for(int i=0;i<INT_SIZE;i++) {
            sum = 0;
            int x = 1<<i;
            for(int j=0;j<array.length;j++) {
                if((x&array[j]) == 0) {
                    sum++;
                }
            }
            if((sum%3) == 0) {
                result |= x;
            }
        }
        return result;
    }
}
