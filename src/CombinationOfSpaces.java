
public class CombinationOfSpaces {
    public static void main(String[] args) {
        String string = "ABCDEF";
//        System.out.println(string.substring(0,0));
        printStringWithSpaces(string);
    }

    private static void printStringWithSpaces(String string) {
        int count = 1;
        while (count <= string.length() / 2) {
            if (count != string.length() / 2) {
                for (int i = 1; i * count < string.length(); i++) {
                    System.out.println(string.substring(0, i * count) + " " + string.substring(i * count));
                }
            }
            int startIndex = 0;
            String spacedString = "";
            for (int i = 0; i < string.length() + 1; i += count) {
                spacedString += string.substring(startIndex, i) + " ";
                startIndex = i;
            }
            System.out.println(spacedString.substring(1, spacedString.length() - 1));
            count++;
        }
    }
}
