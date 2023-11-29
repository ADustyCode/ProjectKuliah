import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class ClientHandler implements Runnable {
    private Socket clientSocket;
    private List<ClientHandler> clients;
    private Scanner in;
    private PrintWriter out;

    public ClientHandler(Socket socket, List<ClientHandler> clients) {
        this.clientSocket = socket;
        this.clients = clients;
    }

    @Override
    public void run() {
        try {
            in = new Scanner(clientSocket.getInputStream());
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            while (true) {
                if (in.hasNext()) {
                    String message = in.nextLine();
                    System.out.println("Received message: " + message);
                    broadcast(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.out.println(message);
        }
    }
}
