import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CompareList {

    public static void main(String[] args) throws IOException {

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(0, 1);

//        arrayList.get(0);
//        arrayList.set(1, 2);
        BufferedReader br = new BufferedReader(new FileReader("/Users/maharjun/Downloads/SuperHeros/src/file1.txt"));
        ArrayList<String> list1 = new ArrayList<>();
        String string;
        while ((string = br.readLine()) != null) {
            list1.add(string);
        }
        br = new BufferedReader(new FileReader("/Users/maharjun/Downloads/SuperHeros/src/file2.txt"));
        ArrayList<String> list2 = new ArrayList<>();
        String string1;
        while ((string1 = br.readLine()) != null) {
            list2.add(string1);
        }

        System.out.println(list1.size() + "," + list2.size());

        if (list1.size() < list2.size()) {
            findCommonString(list2, list1);
        } else {
            findCommonString(list1, list2);
        }

    }

    private static void findCommonString(ArrayList<String> list1, ArrayList<String> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (list2.indexOf(list1.get(i)) == -1) {
                System.out.println(list1.get(i));
            }
        }
        System.out.println(list1.size());
    }
}


