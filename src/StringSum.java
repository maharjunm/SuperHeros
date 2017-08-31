import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringSum {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int sum = findSubStrings(number+"");
        System.out.println(sum);
    }
    public static int findSubStrings(String string) {
        int sum =0;
        if(string.length()==2) {
            sum+= Integer.parseInt(string.charAt(0) +"");
            sum+= Integer.parseInt(string.charAt(1) +"");
            sum += Integer.parseInt(string);
            return sum;
        }
        for(int i=0;i<string.length();i++) {
            sum+= Integer.parseInt(string.charAt(i) +"");
            for(int j = i+1; j<string.length();j++) {
                System.out.println(i + ", " + j);
                sum+= Integer.parseInt(string.substring(i,j));
            }
        }
        sum += Integer.parseInt(string);
        return sum;
    }
}