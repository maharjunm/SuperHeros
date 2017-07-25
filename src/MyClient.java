import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8088);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello Server");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
