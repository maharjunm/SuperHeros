package oracle;

public class FindElement {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,2,3},{7,8,9},{10,11,12}};
        int number = 11;
        int position = findPosition(array, number);
    }

    private static int findPosition(int[][] array, int number) {
        int index = 0;
        int i = array.length/2;
        int j = array.length/2;
        if(number > array[i][j]) {

        } else if( number < array[i][j]) {

        } else {
            return 1;
        }
        return 0;
    }
}
