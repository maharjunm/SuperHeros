
public class LevelSum {

    public static void main(String[] args) {
        String string = "aa";
        String string2 = "a";

        System.out.println(findLongestLength("ababaa"));
    }

    public  String findPrfix(String string1, String string2, int length) {
        String prefix = string2.substring(0, length);
        if (string1.indexOf(prefix) != 0) {
            length = (length + string2.length()/2);
            findPrfix(string1, string2, length);
        } else if(!string1.contains(prefix)){
            length = (length/2);
            findPrfix(string1, string2, length);
        }
        return prefix;
    }
    static int findLongestLength(String string) {
        int sum = string.length();
        for(int i = 0; i < string.length(); i++) {
            String subString = string.substring(i+1);
            System.out.println(subString + "," + string);
            String prefix = findPrefix(string, subString, (subString.length()/2 + 1));
            sum += prefix.length();
        }
        return sum;
    }
    static String findPrefix(String string, String subString, int length) {
        System.out.println(length);
        String prefix = subString.substring(0, length);
        if(string.indexOf(prefix) == 0) {
            length = length + subString.length()/2;
            findPrefix(string, subString, length);
        } else if(!string.contains(prefix)) {
            length = (length/2);
            findPrefix(string, subString, length);
        }
        return prefix;
    }
}
