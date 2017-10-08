package oracle;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(isItAPolindrome(number));
    }

    public static int length(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    private static boolean isItAPolindrome(int number) {
        int length = length(number) - 1;
        int duplicate = number;
        while (duplicate > 0) {
            int digit1 = duplicate % 10;
            int digit2 = (int) (number / Math.pow(10, length) % 10);
//            System.out.println(digit1 + "  , " + digit2 + ", " + (10 * length));
            if (digit1 != digit2) {
                return false;
            }
            length--;
            duplicate = duplicate / 10;
        }
        return true;
    }
}
