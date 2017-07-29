package html;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

class MyHandler1 implements HttpHandler {

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        File file = new File("maharjun.html");
        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader.read());
        String respone = "This is the text";
        httpExchange.sendResponseHeaders(200, respone.length());
        OutputStream outputStream = httpExchange.getResponseBody();
        outputStream.write(respone.getBytes());
        outputStream.close();
    }
}