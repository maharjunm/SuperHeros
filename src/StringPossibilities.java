public class StringPossibilities {
    public static void main(String[] args) {
        String string = "abcde";
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
            for (int j = 1; j <= (string.length() - (i + 1)); j++) {
                findPossibleString(i, j, string);
            }
        }
    }

    public static void findPossibleString(int index, int count, String string) {
        int i = index+1;
        while ((i+count)<=string.length()) {
            String possibleString = string.charAt(index) + "" +string.substring(i,i+count);
            System.out.println(possibleString);
            i++;
        }
    }
}
