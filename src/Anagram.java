import java.util.HashSet;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "bcd";
        Anagram anagram = new Anagram();
        anagram.findAnangrams(string1, string2);
    }
    public void findAnangrams(String string1, String string2) {
        if(string1.length() == string2.length()) {
            HashSet<String> hashSet = anagramsFor(string1);
            if(hashSet.contains(string2)) {
                System.out.println("both are anagrams");
            } else {
                System.out.println("not anagrams");
            }
        } else {
            System.out.println("not anagrams");
        }

    }

    private HashSet<String> anagramsFor(String string) {
        HashSet<String> hashSet = new HashSet<>();
        char[] chars = string.toCharArray();
        for(int i =0;i<string.length();i++) {
            for(int j=0;j<string.length();j++) {
                if(i!=j) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                    String tempString = findString(chars);
                    hashSet.add(tempString);
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return hashSet;
    }

    private String findString(char[] chars) {
        String string = "";
        for(int i=0;i<chars.length;i++) {
            string += chars[i];
        }
        return string;
    }
}
