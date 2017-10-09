package minesweeper;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.io.IOException;

public class Game {
    Square[][] fields;
    int minesCount;

    void setup() throws IOException {
        String input = UserInput.take();
        String[] list = input.split(",");
        boolean isValid = Validator.validate(list);
        fields = new Square[list.length][list.length];
        if (isValid) {
            minesCount = 0;
            for (int i = 0; i < list.length; i++) {
                String singleField = list[i];
                for (int j = 0; j < singleField.length(); j++) {
                    if (singleField.charAt(j) == 'm') {
                        fields[i][j] = new Square(true);
                        minesCount++;
                    } else if (singleField.charAt(j) == 'x') {
                        fields[i][j] = new Square(false);
                    } else {
                        System.out.println("Not valid Input Try Again");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Not valid Input Try Again");
        }
    }

    public void start() throws IOException {
        setup();
        while (true) {
            System.out.print("Enter your choice: ");
            String string = UserInput.take();
            boolean isValid = Validator.validateUserInput(string);
            if (isValid) {
                int[] indexes = InputParser.parseUserInput(string);
                int i = indexes[0];
                int j = indexes[1];
                if (string.charAt(0) == 'o' || string.charAt(0) == 'O') {
                    if (fields[i][j].isMine()) {
                        System.out.println("Game Has been end");
                        break;
                    } else {
                        fields[i][j].setOpenFlag(true);
                        Printer.print(fields);
                        boolean isItAWin = checkForWin();
                        if (isItAWin) {
                            System.out.println("You won the Game \n Congratulations!!!");
                        }
                    }
                } else {
                    Printer.print(fields);
                    fields[i][j].setFlag(!fields[i][j].isFlag());
                }
            } else {
                Printer.print(fields);
                System.out.println("Not valid Input Try Again");
            }
        }
    }

    private boolean checkForWin() {
        int guessCount = 0;
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                if (fields[i][j].isOpenFlag()) {
                    guessCount++;
                }
            }
        }
        int totalFields = fields.length * fields.length;
        System.out.println(totalFields + " , " + minesCount + " , " + guessCount);
        if ((totalFields - minesCount) == guessCount)
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        Game game = new Game();
        game.start();
    }
}
