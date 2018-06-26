
import java.util.*;

class Example {

    static int i = -1;

    public void increment() {
        ++i;
    }

    public void decrement() {
        --i;
    }

    public static void main(String[] args) {
        int z= 1, x =1, a = 7;
        float y = (89 / 27) - z * x + a / (a % 2);
        System.out.println(y);
    }
    public static void printWords(String string) {
        ArrayList<String> arrayList = new ArrayList<>();
        String tempString = "";
        for(int i =0;i<string.length();i++) {
            int ch = string.charAt(i);
            if((ch >= 65 && ch <= 90) || (ch>=97 && ch<=122)) {
                tempString += (char)ch;
            } else {
                if(!tempString.equals("")) {
                    arrayList.add(tempString);
                    tempString ="";
                }

            }
        }

        System.out.println(arrayList.size());
        for(int i=0;i<arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
