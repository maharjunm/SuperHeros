package splitwise;

public class Parser {
    public String[] parse(String string) {
        return  string.split(" ");
    }

    public String[] parsePerson(String string) {
        return string.split(",");
    }
}
