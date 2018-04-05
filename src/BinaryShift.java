import java.util.Scanner;

public class BinaryShift {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String[] list = new String[number];
        for(int i=0;i<number;i++) {
            list[i] = scan.nextLine();
        }
        for(int i = 0; i<list.length;i++) {
            String string = list[i].toUpperCase();
            int count = 0;
            for(int j=0;j<string.length();j++) {
                char ch = string.charAt(j);
                if(isItAVowel(ch)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static boolean isItAVowel(char ch) {
        switch(ch) {
            case 'A':
                return true;
            case 'E':
                return true;
            case 'I':
                return true;
            case 'O':
                return true;
            case 'U':
                return true;
            default:
                return false;
        }
    }
}
