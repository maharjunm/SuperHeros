public class ReplaceIndex {
    public static void main(String[] args) {
        int number = 1234;
        int digits = findDigits(1234);
        int value = 0;
        int index = 2;
        System.out.println(replaceIndex(number, index, value));
    }

    public static int findDigits(int number) {
        int count = 0;
        while (number % 10 != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int replaceIndex(int number, int index, int value) {
        int digits = findDigits(1234);
        int finalNumber = 0;
        double tempNumber = number / Math.pow(10, digits);
        for (int i = 0; i < digits; i++) {
            tempNumber = tempNumber * 10;
            if (index == (i + 1)) {
                finalNumber = finalNumber * 10 + value ;
            } else {
                finalNumber = finalNumber * 10 + (int) tempNumber % 10;
            }
        }
        return finalNumber;
    }
}
