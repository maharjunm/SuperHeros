import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StringCombinations {
    static String string;

    public static void main(String[] args) {
        string = "abcd";
//        for (int i = 0; i < string.length(); i++) {
//            printCombinations(0, string.toCharArray());
//            System.out.println("==============");
//        }
        char[] chars = string.toCharArray();
        findComb(chars, 0);
//        System.out.println(string);

    }

    private static void printCombinations(int index, char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars.length; j++) {
//                System.out.println("i = "+i + "j = "+ j);
                if (j != index && i!=index && i !=j) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
//                    if (!chars.toString().equals(string)) {
                    printString(chars);
//                    }
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
    }

    private static void printString(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static void findComb(char[] chars, int k) {
        if (k == chars.length) {
            for (int i = 0; i < chars.length; i++) {
                System.out.print(chars[i]);
            }
            System.out.println();
        } else {
            for (int i = k; i < chars.length; i++) {
                char temp = chars[i];
                chars[i] = chars[k];
                chars[k] = temp;
//                System.out.println("------"+(k+1) +"---"+i);
//                printString(chars);
                findComb(chars, k + 1);
                temp = chars[i];
                chars[i] = chars[k];
                chars[k] = temp;
            }
        }
    }
}
