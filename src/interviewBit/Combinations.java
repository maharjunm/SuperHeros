package interviewBit;

public class Combinations {

    public static void main(String[] args) {
        String string = "acb";
        char[] list = findChars(string);

    }

    private static char[] findChars(String string) {
        char[] list = string.toCharArray();
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if(list[i]>list[j]) {
                    char temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
