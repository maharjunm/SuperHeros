import java.util.Scanner;

public class Input {
    private Scanner scanner;

    Input(Scanner scanner) {
        this.scanner = scanner;
    }
    String take() {
        String string = scanner.nextLine();
        return string;
    }
}
