import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) throws IOException {
        String hostname = "localhost";
        int port = 8080;
        try (Socket socket = new Socket(hostname, port)) {
            System.out.println("Hello server");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello server");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Server resoponse : " + response);
        } catch (UnknownHostException exception) {
            System.out.println("UnknownHostException : " + exception.getMessage());
            exception.printStackTrace();
        } catch (IOException exception) {
            System.out.println("IOException :" + exception.getMessage());
            exception.printStackTrace();
        }
    }
}
