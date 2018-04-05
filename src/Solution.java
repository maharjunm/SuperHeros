import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] arps) {
        System.out.println(new Date());
        System.out.println(getDateFromString("2017-13-20", "yyyyy/MM/dd"));
//        System.out.println(getDateFromString("2017-09-13 19:10:42:00.0 ", "yyyyy-MM-dd"));
    }

    public static Date getDateFromString(String strDate, String format) {

        if(null == strDate || strDate.isEmpty()){
            return null;
        }

        SimpleDateFormat formatter = new SimpleDateFormat(format);
        try {
            Date date = formatter.parse(strDate);
            return date;
        } catch (ParseException e) {
            return null;
        }
    }
}