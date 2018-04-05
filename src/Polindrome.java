import java.util.ArrayList;

public class Polindrome {
    public static void main(String[] args) {
        Polindrome polindrome = new Polindrome();
        polindrome.findNearestPolindrome(1234);
    }
    public int findNearestPolindrome(int number) {
        String string = "" + number;
        int length = string.length();
        for(int i =0;i<string.length();i++) {
            System.out.println("---------------");
            System.out.println(i + "-----" + (string.length()-i-1));
            if(i<(string.length()-i-1)) {
                System.out.println(string.substring(0, length-i-1) + "" + string.substring(0,i+1)) ;
            }
        }
        return  1;
    }

    private boolean isPolindrome(String string) {
        String tempString = "";
        for(int i=string.length()-1;i>=0;i--) {
            tempString+=string.charAt(i);
        }
        return tempString.equals(string);
    }

    private String findString(char[] array) {
        String string = "";
        for(int i=0;i<array.length;i++) {
            string+=array[i];
        }
        return string;
    }
}
