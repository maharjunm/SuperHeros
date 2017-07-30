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
        httpServer.createContext("/srikanth", new SrikanthHandler());
        httpServer.createContext("/mahesh", new MaheshHandler());
        httpServer.start();
    }
}


