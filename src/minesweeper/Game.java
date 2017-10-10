package minesweeper;

public class Game {
    Square[][] fields;
    int minesCount;

    void setup() throws Exception {
        String input = UserInput.take();
        String[] list = input.split(",");
        try {
            Validator.validate(list);
            fields = new Square[list.length][list.length];
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
                        Printer.print("Not valid Input Try Again");
                        break;
                    }
                }
            }
        } catch (Exception e) {
            Printer.print("Error:: " + e.getMessage());
        }
    }

    public void start() throws Exception {
        setup();
        while (true) {
            Printer.print("Enter your choice: ");
            String string = UserInput.take();
            try {
                Validator.validateUserInput(string);
                int[] indexes = InputParser.parseUserInput(string);
                int i = indexes[0];
                int j = indexes[1];
                if (string.charAt(0) == 'o' || string.charAt(0) == 'O') {
                    if (fields[i][j].isMine()) {
                        Printer.print("Game Has been end");
                        break;
                    } else {
                        fields[i][j].setOpenFlag(true);
                        Printer.printFields(fields);
                        boolean isItAWin = checkForWin();
                        if (isItAWin) {
                            Printer.print("You won the Game \n Congratulations!!!");
                        }
                    }
                } else {
                    Printer.printFields(fields);
                    fields[i][j].setFlag(!fields[i][j].isFlag());
                }

            } catch (Exception e) {
                Printer.print(("Error:: " + e.getMessage()));
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
        if ((totalFields - minesCount) == guessCount)
            return true;
        return false;
    }

    public static void main(String[] args) throws Exception {
        Game game = new Game();
        game.start();
    }
}
