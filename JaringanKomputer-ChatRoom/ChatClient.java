import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient extends JFrame {
    private Socket socket;
    private Scanner in;
    private PrintWriter out;
    private String username;

    private JTextArea chatArea;
    private JTextField messageField;
    private JTextField ipField;
    private JTextField usernameField;

    public ChatClient() {
        super("Chat Client");

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(chatArea);
        add(scrollPane, BorderLayout.CENTER);

        messageField = new JTextField();
        messageField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (out != null) {
                    processUserInput(e.getActionCommand());
                    messageField.setText("");
                } else {
                    chatArea.append("Not connected to the server.\n");
                }
            }
        });
        add(messageField, BorderLayout.SOUTH);

        ipField = new JTextField("localhost");
        ipField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connectToServer(ipField.getText());
            }
        });
        add(ipField, BorderLayout.NORTH);

        // Text field for entering the username
        usernameField = new JTextField("Enter your username");
        usernameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setUsername(usernameField.getText());
            }
        });
        add(usernameField, BorderLayout.WEST);

        // Panel for the buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Clear Chat button
        JButton clearButton = new JButton("Clear Chat");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearChat();
            }
        });
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.EAST);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void connectToServer(String serverIP) {
        try {
            if (username != null) {
                socket = new Socket(serverIP, 12345);
                in = new Scanner(socket.getInputStream());
                out = new PrintWriter(socket.getOutputStream(), true);

                System.out.println("Connected to the server.");

                sendMessage("/username " + username);

                Thread thread = new Thread(new IncomingReader());
                thread.start();
            } else {
                chatArea.append("Please set a username before connecting.\n");
            }
        } catch (IOException e) {
            System.err.println("Error connecting to the server: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void setUsername(String newUsername) {
        username = newUsername;
        chatArea.append("Username set to: " + username + "\n");
    }

    private void processUserInput(String userInput) {
        sendMessage(username + ": " + userInput);
    }

    private void sendMessage(String message) {
        out.println(message);
    }

    private void clearChat() {
        chatArea.setText("");
    }

    private class IncomingReader implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    if (in.hasNext()) {
                        String message = in.nextLine();
                        chatArea.append(message + "\n");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ChatClient().setVisible(true);
            }
        });
    }
}
