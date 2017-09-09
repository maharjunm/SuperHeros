package graphs;

import java.util.Scanner;

public class AdjecencyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][5];
        for(int i=0;i<5;i++) {
            String string = scanner.nextLine();
            String[] arr = string.split(" ");
            int index1 = Integer.parseInt(arr[0]);
            int index2 = Integer.parseInt(arr[1]);
            array[index1-1][index2-1] = 1;
            array[index2-1][index1-1] = 1;
        }
        for(int i=0;i<5;i++) {
            array[i][i] = 1;
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
