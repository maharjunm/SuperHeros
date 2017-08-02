import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaLoggerExample {
    private static final Logger LOGGER = Logger.getLogger(JavaLoggerExample.class.getName());

    public static void main(String[] args) throws SecurityException, IOException {
        String str = null;
        LOGGER.info("Logger Name: " + LOGGER.getName());
        LOGGER.warning("Can cause NullPointerException");
        LOGGER.log(Level.INFO, "something i want to log");
    }
}