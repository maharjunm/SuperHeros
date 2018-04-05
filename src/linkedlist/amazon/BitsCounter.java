package linkedlist.amazon;

import java.util.Scanner;

public class BitsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += countBits(i);
        }
        System.out.println(sum);
    }

    private static int countBits(int number) {
        int count = 0;
        String bitsForNumber = getBits(number);
        for(int i=0;i<bitsForNumber.length();i++) {
            if(bitsForNumber.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    private static String getBits(int number) {
        String reversedBits = "";
        while (number != 0) {
            reversedBits += (number % 2);
            number = number / 2;
        }
        String normalBits = "";

        for(int i=reversedBits.length()-1;i>=0;i--) {
            normalBits += reversedBits.charAt(i);
        }
        return normalBits;
    }


}
