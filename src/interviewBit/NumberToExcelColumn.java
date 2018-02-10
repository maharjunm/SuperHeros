package interviewBit;


public class NumberToExcelColumn {

    public static void main(String[] args) {
        int number = 1352;
//        System.out.println(1351/26);
        System.out.println(findColumn(number));
//        System.out.println(findColumn1(943566));
    }

    private static String findColumn(int number) {
        String chars="ZABCDEFGHIJKLMNOPQRSTUVWXY";
        String columnName = "";
        while (number>0) {
            int position = number%26;
            columnName = chars.charAt(position) + columnName;
            number = (number-1)/26;
            System.out.println(number);
        }
        return columnName;
    }

    public static String findColumn1(int colNum){
        int Base = 26;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String colName = "";

        while (colNum > 0) {
            int position = colNum % Base;
            colName = (position == 0 ? 'Z' : chars.charAt(position > 0 ? position - 1 : 0)) + colName;
            colNum = (colNum - 1) / Base;
        }
        return colName;
    }


}
