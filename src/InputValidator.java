
public class InputValidator {
    public static boolean validate(String string) {
        if(string == null || string.length() <= 2) {
            return false;
        }
        if(string.substring(0,2).equals("0 ")){
            try {
                Integer.parseInt(string.substring(2));
                return true;
            } catch (Exception exception) {
                return false;
            }
        }
        return false;
    }
}
