package interviewBit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GCD {
    public static void main(String[] args) {
        int[] A = {3, 11, 17, 8, 2, 15, 11, 10, 18, 5, 10, 16, 12, 10, 8, 17, 3, 14};
        int[][] B = {
                {4, 4},
                {5, 4},
                {1, 14},
                {4, 4},
                {4, 17},
                {6, 14},
                {1, 15},
                {5, 16},
                {9, 12},
                {5, 17},
                {4, 12},
                {5, 5},
                {5, 18},
                {7, 5},
                {6, 14},
                {2, 13},
                {3, 6},
                {3, 14}
        };
        GCD gcd = new GCD();
        int[] array = gcd.getMode(A, B);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public static int gcd(int A, int B) {
        if (A % B == 0) return B;
        if (B % A == 0) return A;
        if (A > B) {
            return gcd(A - B, B);
        }
        return gcd(A, B - A);
    }

    public int[] getMode(int[] A, int[][] B) {
        int[] array = new int[B.length];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (hashMap.containsKey(A[i])) {
                Integer newValue = (Integer) hashMap.get(A[i]) + 1;
                hashMap.put((Integer) A[i], newValue);
            } else {
                hashMap.put(A[i], 1);
            }

        }
        int minValue = findMode(hashMap);
        System.out.println(minValue);
        for (int i = 0; i < B.length; i++) {
            if(i == 0) {
                array[i] = minValue;
            } else {
                Integer newValue;
                if (hashMap.containsKey(B[i][1])) {
                    newValue = (Integer) hashMap.get(B[i][1]) + 1;
                    hashMap.put((Integer) B[i][1], newValue);
                } else {
                    newValue = 1;
                    hashMap.put((Integer) B[i][1], newValue);
                }
                System.out.println(B[i][1] + ", " + hashMap.get(B[i][1]) + "," + hashMap.get(array[i-1]) + "," + array[i-1]);
                if (newValue > (Integer) hashMap.get(array[i-1])) {
                    array[i] = newValue;
                } else if (newValue == hashMap.get(array[i - 1])) {
                    if (array[i - 1] < B[i][1]) {
                        array[i] = B[i][1];
                    } else {
                        array[i] = array[i - 1];
                    }
                } else {
                    array[i] = array[i - 1];
                }

            }
        }
        return array;
    }

    public int findMode(HashMap<Integer, Integer> hashMap) {
        Iterator it = hashMap.entrySet().iterator();
        int minValue = (Integer) hashMap.keySet().toArray()[0];
        int maxCount = (Integer) hashMap.get(minValue);
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            int value = (Integer) pair.getKey();
            int count = (Integer) pair.getValue();
            if ((Integer) maxCount <= count) {
                if (maxCount < count) {
                    minValue = value;
                    maxCount = count;
                } else if (maxCount == count) {
                    if (minValue > value) {
                        minValue = value;
                        maxCount = count;
                    }
                }
            }
        }
        return minValue;
    }
}
