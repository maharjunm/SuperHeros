public class StringConverter {
    public static void main(String[] args) {
        String string = "12340";
        int sum = 0;
        for(int i =0;i<string.length();i++) {
            sum = sum*10 + findNumber(string.charAt(i));
        }
        System.out.println(sum);
    }
    public static int findNumber(char ch) {
        return (((int)ch)%48);
    }
}