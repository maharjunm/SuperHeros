public class FindSum {
    public static void main(String[] args) {
        int[] array = new int[100];
        int finalSum = 100;
        for (int i = 1; i <= 100; i++) {
            array[i-1] = i;
        }
        int sum =0;
        for(int i =0;i<array.length/2;i++) {
            sum = array[i];
            int avialble = finalSum-sum;
            if(avialble >= array[array.length/2] && avialble <= array[array.length -1]) {
                System.out.println(array[i] + "," + avialble);
            }
        }
    }
}
