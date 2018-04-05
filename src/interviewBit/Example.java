package interviewBit;

public class Example {
    public static void main(String[] args) {
        int[] array = {0};
        int B = 1;
        int C = 5;
        System.out.println(Math.sqrt(536870912));
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int solve(int[] A, int B, int C) {
        int count=0;
        for(int i =0;i<A.length;i++) {
            for(int j=0;j<A.length;j++) {
                int number = Integer.parseInt((A[i] + "" + A[j]));
                int number1 = Integer.parseInt((A[j] + "" + A[i]));
                if(number>= B && number<=C) {
                    System.out.println(number);
                    count++;
                }
                if(number1 >= B && number1<=C) {
                    count++;
                    System.out.println(number1);
                }
            }
        }
        System.out.println(count);
        return count;
    }
}
