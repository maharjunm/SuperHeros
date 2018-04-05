import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class MinimalPath {
    public static void main(String[] args) throws UnknownHostException, ParseException {
        String string =  "2011-01-18 00:00:00.0";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = dateFormat.parse(string);
        System.out.println(dateFormat.format(date));
    }
}
