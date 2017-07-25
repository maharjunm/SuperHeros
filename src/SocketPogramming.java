import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketPogramming {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8088);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String string = (String) dataInputStream.readUTF();
            System.out.println("the requested information" + string);
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
