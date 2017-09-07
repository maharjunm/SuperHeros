import java.util.ArrayList;

public class Polindrome {
    public static void main(String[] args) {
        String string = "1442";
        Polindrome polindrome = new Polindrome();
        System.out.println(polindrome.findNearestPolindrome(1442));
    }
    public int findNearestPolindrome(int number) {
        String string = "" + number;
//        char[] array = ("" + number).toCharArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0;i<string.length();i++) {
            char[] array = ("" + number).toCharArray();
            array[i] = array[array.length-1-i];
            String tempString = findString(array);
            if(isPolindrome(tempString)) {
                arrayList.add(Integer.parseInt(tempString));
            }
        }
        int minDiff = arrayList.get(0);
        for(int i=1;i<arrayList.size();i++) {
            if((arrayList.get(i) - number) < minDiff) {
                minDiff = arrayList.get(i);
            }
        }
        return  minDiff;
    }

    private boolean isPolindrome(String string) {
        String tempString = "";
        for(int i=string.length()-1;i>=0;i--) {
            tempString+=string.charAt(i);
        }
        return tempString.equals(string);
    }

    private String findString(char[] array) {
        String string = "";
        for(int i=0;i<array.length;i++) {
            string+=array[i];
        }
        return string;
    }
}
