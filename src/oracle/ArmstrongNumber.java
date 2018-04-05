package oracle;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println(isItArmstrongNumber(number));
    }

    private static boolean isItArmstrongNumber(int number) {
        int sum = 0;
        int dulicate = number;
        while (number > 0) {
            sum += Math.pow((int)(number % 10), 3);
            number = number/10;
        }
        if(sum == dulicate)
            return true;
        return false;
    }
}
