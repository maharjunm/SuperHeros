package minesweeper;

public class Validator {
    public static void validate(String[] list) throws Exception {
        for (int i = 0; i < list.length; i++) {
            if(list[i].length() != list.length)
                throw new Exception("Invalid Input");
        }
        return ;
    }

    public static void validateUserInput(String string) throws Exception {
        if(string.length() == 0)
            throw new Exception("Invalid Input");
        if(string.charAt(0) != 'o' && string.charAt(0) != 'O' && string.charAt(0) != 'f' && string.charAt(0) != 'F')
            throw new Exception("Invalid Input");
    }
}
