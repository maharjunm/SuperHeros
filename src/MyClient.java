import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.toArray();
        try {
            Socket socket;
            Scanner scanner = new Scanner(System.in);
            String string;
            DataOutputStream dataOutputStream;
            do {
                socket = new Socket("localhost", 8088);
                dataOutputStream = new DataOutputStream(socket.getOutputStream());
                System.out.print("Give input to server : ");
                string = scanner.next();
                dataOutputStream.writeUTF(string);
                dataOutputStream.flush();
                DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
                String outputFromServer = dataInputStream.readUTF();
                System.out.println("The total is " + outputFromServer);
            } while (!"q".equals(string));
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
