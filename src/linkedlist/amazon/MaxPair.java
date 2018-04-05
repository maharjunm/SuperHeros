package linkedlist.amazon;

import java.util.Scanner;

public class MaxPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        int[] pair = findPair(array);
        System.out.println(pair[0]);
        System.out.println(pair[1]);
    }

    private static int[] findPair(int[] array) {
        int first = array[0];
        int second = array[1];
        int maxNumber = second * first;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int multiply = array[i] * array[j];
                if (maxNumber >= maxNumber) {
                    first = array[i];
                    second = array[j];
                }
            }
        }
        return new int[]{first, second};
    }
}
