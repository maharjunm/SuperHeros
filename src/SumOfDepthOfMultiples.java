import java.util.ArrayList;
import java.util.List;

public class SumOfDepthOfMultiples {
    public static void main(String[] args) {
        int number = 4;
        int level = 4;
        System.out.println(findSum(number, level));
    }

    public static int findSum(int number, int level) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                list.add(i);
            }
        }
        int count = 0;
        while (true) {
//            System.out.println("hellllo");
            List<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
//                System.out.println(list.get(i) + " >>>>> ");
                for (int j = 1; j <= list.get(i); j++) {
                    if (list.get(i) % j == 0) {
//                        System.out.println(j + " -----------");
                        arrayList.add(j);
                    }
                }
//                System.out.println();
            }
            list = arrayList;
            count++;
            if (count == level - 1) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.print(list.get(i) + ", ");
                    sum += list.get(i);
                }
                System.out.println();
                break;
            }
        }
        return sum;
    }
}
