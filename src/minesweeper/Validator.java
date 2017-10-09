package minesweeper;

public class Validator {
    public static boolean validate(String[] list) {
        for (int i = 0; i < list.length; i++) {
            if(list[i].length() != list.length)
                return false;
        }
        return true;
    }

    public static boolean validateUserInput(String string) {
        if(string.length() == 0)
            return false;
        if(string.charAt(0) == 'o' || string.charAt(0) == 'O' || string.charAt(0) == 'f' || string.charAt(0) == 'F')
            return true;
        return false;
    }
}
