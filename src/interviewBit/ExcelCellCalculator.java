package interviewBit;

public class ExcelCellCalculator {

    public static void main(String[] args) {
        String string = "BZ";
        System.out.println(getValue(string));
    }

    public static int getValue(String string) {
        int value = 0;
        int count=0;
        for(int i = string.length()-1;i>=0;i--) {
            value += ((int)string.charAt(i)%65)+getPowerValue(count++);
        }
        return value;
    }

    public static int getPowerValue(int number) {
        if(number==0)
            return 1;
        if(number == 1)
            return 26;
        return 26*getPowerValue(number-1);
    }
}
