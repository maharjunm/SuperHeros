package interviewBit;

import doors.Door;
import org.omg.PortableInterceptor.INACTIVE;

public class Polindrome {
    public static void main(String[] args) {
        String string = "-1146467285";
        int some = Integer.parseInt(string);
        System.out.println(some);
        int number = -123;
        System.out.println(getNumber(-1146467285));
        System.out.println(getNumber(-1146));
    }

    private static boolean isPolindrome(int number) {
        if (number > 0) {

            int reverseNumber = 0;
            while (number > 0) {
                reverseNumber = reverseNumber * 10 + number % 10;
                number = number / 10;
            }
            System.out.println(reverseNumber);
            return false;
        }
        int reverseNumber = -0;
        while(number<-0.1) {
            reverseNumber = reverseNumber*10 + number%10;
            number = number/10;
        }
        return false;
    }

    public static int getNumber(int number) {
        if (number > 0) {
            int reverseNumber = 0;
            while (number > 0) {
                reverseNumber = reverseNumber * 10 + number % 10;
                number = number / 10;
            }
            return reverseNumber;
        }
        int reverseNumber = -0;
        while(number<-0.1) {
            try {

                reverseNumber = reverseNumber*10 + number%10;
                Double doub = Double.parseDouble("2147483648");
                if( Math.abs(reverseNumber)> doub)
                    return 0;
            } catch (Exception e) {
                return 0;
            }
            number = number/10;
        }
        return reverseNumber;
    }

}
