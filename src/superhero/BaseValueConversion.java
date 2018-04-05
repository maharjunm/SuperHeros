package superhero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BaseValueConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello.. Hope you are doing good.");
        System.out.print("Enter the value to convert: ");
        String string = br.readLine();
        System.out.print("Enter the value of the initial base: ");
        int initialBase = Integer.parseInt(br.readLine());
        System.out.print("Enter the value of desired base of the output: ");
        int desiredBase = Integer.parseInt(br.readLine());
        if(isiTAbase(desiredBase) && isiTAbase(initialBase)) {
            if(isValidInteger(string, initialBase)) {
                String convertedValue = convertInteger(string, initialBase, desiredBase);
                System.out.println(convertedValue);
            } else {
                prindInvalidMessage();
            }
        } else {
            prindInvalidMessage();
        }


    }

    public static void prindInvalidMessage() {
        System.out.println("we don’t know how to do that yet");
    }

    public static String convertInteger(String theValue, int initialBase, int finalBase) {
        Integer initialValue = Integer.valueOf(theValue, initialBase);
        return Integer.toString(initialValue, finalBase);
    }

    public static  boolean isiTAbase(int base) {
        return base>=2 && base<=36;
    }

    public static boolean isValidInteger(String theValue, int theBase) {
        try{
            Integer x = Integer.valueOf(theValue, theBase);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
