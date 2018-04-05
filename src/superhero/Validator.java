package superhero;

public class Validator {
    public static void validate(String string) throws Exception {
        if(string == null || string.equals("")) {
            throw new Exception("Invalid Input");
        }
    }
}
