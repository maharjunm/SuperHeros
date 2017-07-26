import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket;
            Scanner scanner = new Scanner(System.in);
            String string;
            DataOutputStream dataOutputStream;
            do{
                socket = new Socket("localhost", 8088);
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                string = scanner.next();
                dataOutputStream.writeUTF(string);
            } while ("q".equals(string));
            socket.close();
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
