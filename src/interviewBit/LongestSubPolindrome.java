package interviewBit;


public class LongestSubPolindrome {
    public static void main(String[] args) {
        String string = "malayalam";
        System.out.println(findPolindrome(string));
    }

    private static boolean isIsAPolindrome(String string) {
        int lastIndex = string.length() - 1;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(lastIndex--)) {
                return false;
            }
        }
        return true;
    }

    public static String findPolindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i != j) {
            if (string.charAt(i) == string.charAt(j)) {
                if (isIsAPolindrome(string.substring(i, j + 1))) {
                    return string.substring(i, j + 1);
                }
            }
            if (i == j - 1) {
                if (isIsAPolindrome(string.substring(i, j+1))) return string.substring(i, j+1);
                i = i + 1;
                j = string.length() - 1;
            } else {
                j--;
            }
        }
        return "";
    }

}
