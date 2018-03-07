package interviewBit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayInterchange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] list = new int[number];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }
        ArrayInterchange object = new ArrayInterchange();
        int[] array = object.swapRandomValues(list);
        object.printValues(array);
    }

    private int[] swapRandomValues(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int randomIndex = (int) (Math.random() * (float)list.length);
            int temp = list[randomIndex];
            list[randomIndex] = list[i];
            list[i] = temp;
        }
        return list;
    }

    public void printValues(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
