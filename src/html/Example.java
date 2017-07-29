package html;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/html/maharjun.html");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }

}
