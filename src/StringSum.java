import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSum {
    public static void main(String args[] ) throws Exception {
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
        long sum = findSubStrings("698431717");
        long number = (long)972698438521l;
        long variation = (long)(sum%(Math.pow(10,9)+7));
        System.out.println((variation));
//        System.out.println((l)%(long)(Math.pow(10,9)+7));
    }
    public static long findSubStrings(String string) {
        long sum =0;
        for(int i=0;i<string.length();i++) {
            sum+= Long.parseLong(string.charAt(i) +"");
            for(int j = i+1; j<string.length();j++) {
            System.out.println("------------->" + sum + "," + string.substring(i,j+1));
                sum+= Long.parseLong(string.substring(i,j+1));
            }
        }
        System.out.println(sum);
        return sum;
    }
}