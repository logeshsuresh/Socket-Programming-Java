import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port :" + port);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    String clientMessage = in.readLine();
                    System.out.println("Message from client :" + clientMessage);
                    out.println("Echo from Server" + clientMessage);
                }
            }
        } catch (IOException exception) {
            System.out.println("Server exception : " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
