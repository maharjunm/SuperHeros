package minesweeper;

public class Printer {
    public static void printFields(Square[][] fields) {
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields.length; j++) {
                System.out.print(fields[i][j].isOpenFlag() ? '0' : (fields[i][j].isFlag() ? 'F' : 'X'));
            }
            System.out.println();
        }
    }
    public static void print(String string) {
        System.out.println(string);
    }
}
