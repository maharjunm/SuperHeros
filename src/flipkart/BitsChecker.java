package flipkart;

public class BitsChecker {
    public static void main(String[] args) {
        int number = 10;
        int number1 = 13;
        String bits1 = generateBit(number);
        String bits2 = generateBit(number1);
        System.out.println(bits1);
        System.out.println(bits2);
    }

    public static String generateBit(int number) {
        String bits = "";
        while (number > 0) {
            bits= number%2 + bits;
            number = number /2;
        }

//        String actualBits =
        return bits;
    }
}
