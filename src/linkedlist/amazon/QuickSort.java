package linkedlist.amazon;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{1,5,4,3,6,7,2};
        int pivot = array.length/2;
        arraySort(array, pivot, 0, array.length);
    }

    private static int[] arraySort(int[] array, int pivot, int start, int end) {
        for(int i=start; i<=end;i++) {
            if(array[i]>array[pivot]) {

            } else {

            }
        }
        return new int[0];
    }
}
