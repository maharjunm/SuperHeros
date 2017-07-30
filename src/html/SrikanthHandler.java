package html;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.*;

class SrikanthHandler implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        File file = new File("./src/html/srikanth.html");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String totalFile = "";
        while ((line = bufferedReader.readLine()) != null) {
            totalFile += line;
        }
        httpExchange.sendResponseHeaders(200, totalFile.length());
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(totalFile.getBytes());
        outputStream.close();
    }
}