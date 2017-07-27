import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketPogramming {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string = dataInputStream.readUTF();
            do {
                int total = 0;
                if (string.charAt(0) == '+') {
                    for (int i = 1; i < (string.length()); i++) {
                        total += Integer.parseInt(String.valueOf(string.charAt(i)));
                    }
                    System.out.println("The total is " + total);
                } else if (string.charAt(0) == '-') {
                    for (int i = 1; i < (string.length()); i++) {
                        total -= Integer.parseInt(String.valueOf(string.charAt(i)));
                    }
                    System.out.println("Message sent to the client is " + total);
                } else {
                    System.out.println("wrong input");
                }
                DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                dataOutputStream.writeUTF(total+"");
                dataOutputStream.flush();
                socket = serverSocket.accept();
                dataInputStream = new DataInputStream(socket.getInputStream());
                string = (String) dataInputStream.readUTF();
            } while(!string.equals("q"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
