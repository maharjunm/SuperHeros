import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearestPrimeNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        NearestPrimeNumber object = new NearestPrimeNumber();
        System.out.println(object.nearestPrimeNumber(number));
    }

    public int nearestPrimeNumber(int number) {
        int i = number + 1;
        int j = number - 1;
        while (!isPrime(i) && !isPrime(j)) {
            i++;
            if (j >= 2) {
                j--;
            }
        }
        if(isPrime(i)) {
            return i;
        }
        return j;
    }

    public boolean isPrime(int number) {
        int rootValue = (int) Math.sqrt(number);
        int count = 0;
        for (int i = 1; i <= rootValue; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if(number == 1)
            return false;
        if (count == 1)
            return true;
        return false;
    }
}
