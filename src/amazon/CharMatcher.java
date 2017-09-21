package amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CharMatcher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();
        int number = Integer.parseInt(string.substring(0, string.length()));
        String[] array = new String[number];
        for (int i = 0; i < number; i++) {
            array[i] = bufferedReader.readLine();
        }
        int length = Integer.parseInt(bufferedReader.readLine());
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = bufferedReader.readLine().charAt(0);
        }

        ArrayList<String> finalArray = findString(array, chars);
    }

    public static ArrayList<String> findString(String[] array, char[] chars) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String string = array[i];
            int length = string.length();
            int count = 0;
            for (int j = 0; j < length; j++) {
                char char1 = string.charAt(j);
                for (int x = 0; x < chars.length; x++) {
                    if (char1 == chars[x]) {
                        count++;
                    }
                }
            }
            if (count == string.length()) {
                System.out.println(string);
                arrayList.add(string);
            }

        }
        return arrayList;
    }
}
