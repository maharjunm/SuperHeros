public class CompressStrings {
    public static void main(String[] args) {
        String string = "AADDBBBBCEEEAAAAA";
        int count = 1;
        char char1 = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (char1 == string.charAt(i)) {
                count++;
                if (i == string.length() - 1) {
                    printChar(count, char1);
                }
            } else {
                printChar(count, char1);
                count = 1;
                char1 = string.charAt(i);
            }
        }
        System.out.println();
    }

    public static void printChar(int count, char char1) {
        if (count == 1) {
            System.out.print(char1);
        } else {
            System.out.print(char1 + "" + count);
        }
    }
}
