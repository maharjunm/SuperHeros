package oracle;

import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    static int number = -1;

    public void decrement() {
        --number;
    }

    public void increment() {
        ++number;
    }

    public static void main(String[] args) throws OwnException {
        int i = 1234567890;
        for (int base : new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 16}) {
            String s = Integer.toString(i, base);
            System.out.println(s);
        }

        String s = "XYZ";
        for (int base : new int[]{16}) {
            try {

                Integer x = Integer.valueOf(s, base);
            } catch (Exception e) {
                System.out.println("");
            }
        }
    }

}
