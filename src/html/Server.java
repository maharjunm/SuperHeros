package html;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;

public class Server {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress(9091), 0);
        httpServer.createContext("/maharjun", new MyHandler());
        httpServer.start();
    }

    static class MyHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange httpExchange) throws IOException {
            File file = new File("./src/html/maharjun.html");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            String totalFile = "";
            while((line = bufferedReader.readLine()) != null){
                totalFile += line;
            }
            httpExchange.sendResponseHeaders(200, totalFile.length());
            OutputStream outputStream = httpExchange.getResponseBody();
            outputStream.write(totalFile.getBytes());
            outputStream.close();
        }
    }
}


