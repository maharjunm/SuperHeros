import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class StringPermutation {
    public static void main(String[] args) {
        String string = "abcd";
        for (int i = 0; i < string.length(); i++) {
            printCombinations(i, string);
        }
        System.out.println(string);

    }

    private static void printCombinations(int i, String string) {
        for (int j = 0; j < string.length(); j++) {
            if (j != i) {
                String tempString = "";
                for (int k = 0; k < string.length(); k++) {
                    if (k == j || k == i) {
                        if (k == j) {
                            tempString += string.charAt(i);
                        } else {
                            tempString = tempString + string.charAt(j);
                        }
                    } else {
                        tempString += string.charAt(k);
                    }
                }
                System.out.println(tempString);
            }
        }
    }
}
