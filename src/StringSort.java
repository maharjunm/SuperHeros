
public class StringSort {
    static String[] finalList;
    public static void main(String[] args) {
        String[] list = {"1", "10", "2", "20", "9", "100", "110", "101", "120", "91", "1001", "100001"};

        finalList = sortByLength(list);
        findVariations(list);
        printList(finalList);
    }
    public static void findVariations(String[] list) {
        int index = 0;
        for(int i =0; i<list.length;i++) {
            if(list[index].length() != list[i].length()) {
                sortwithValue(index, i);
                index = i;
            } else if(i == list.length -1) {
                sortwithValue(index, i);
            }
        }
    }

    private static void sortwithValue( int index, int i) {
        for (; index < i; index++) {
            for (int j = index + 1; j < i; j++) {
                if (finalList[index].compareTo(finalList[j]) >= 1) {
                    String temp = finalList[index];
                    finalList[index] = finalList[j];
                    finalList[j] = temp;
                }
            }
        }
    }

    public static void printList(String[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static String[] sortByLength(String[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].length() > list[j].length()) {
                    String temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}
