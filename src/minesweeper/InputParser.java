package minesweeper;

public class InputParser {
    public String[] parse(String string) {
        return string.split(",");
    }

    public static int[] parseUserInput(String input) {
        String[] list = input.split(",");
        int x = Integer.parseInt(list[0].substring(2));
        int y = Integer.parseInt(list[1].substring(0, list[1].length() - 1));
        return new int[]{x, y};
    }
}
