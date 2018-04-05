package interviewBit;

public class BinarySearch {

    public static void main(String[] args) {
        int[] list = {5,6,1,2,3,4};
        int index = findBreakingIndex(list, 0, list.length-2);
    }

    public static int findBreakingIndex(int[] list, int first, int last) {
        int index = (first + last )/2;
        if(list[index] > list[index-1])
            return index;
//        if(>list[index])
        return 1;
    }
}
