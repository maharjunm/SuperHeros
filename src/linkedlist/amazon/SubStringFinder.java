package linkedlist.amazon;

import java.util.Scanner;

public class SubStringFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "";
//        while (scanner.hasNext()) {
            string = scanner.next();
//        }
        int count = findNumber(string.substring(0, string.length()));
        System.out.println(count);
    }

    private static int findNumber(String string) {
        int length = string.length();
        int finalCount = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (string.charAt(i) == '1') {
                count++;
                if (count == 2) {
                    finalCount++;
                } else if (count >= 3) {
                    finalCount += 2;
                }
            }
        }
        return finalCount + 1;
    }
}
