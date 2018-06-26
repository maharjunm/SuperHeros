package superhero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Substring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter String for finding Longest Substring: ");
        String string = br.readLine();
        String sub = findLongestSubstring(string);
        System.out.println(sub);
    }

    private static String findLongestSubstring(String string) {
        String substring = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                String tempString = string.substring(i, j + 1);
                if(!havingRepeatingChars(tempString)) {
                    if (string.indexOf(tempString)> 0 ) {
                      if(substring.length() < tempString.length()) {
                          substring = tempString;
                      }
                    }
                }
            }
        }
        return substring;
    }

    private static boolean havingRepeatingChars(String string) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (!hashMap.containsKey(string.charAt(i))) {
                hashMap.put(string.charAt(i), 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
