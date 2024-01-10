package networking.first_lesson;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(22222);
        System.out.println("Server started..");

        while(true){
            Socket socket = serverSocket.accept();
            System.out.println("Client connects..");

            ObjectInputStream objectInput = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream objectOutput = new ObjectOutputStream(socket.getOutputStream());

            try {
                Object message = objectInput.readObject();
                System.out.println("Client says: " + (String) message);

                String messageToClient = (String) message;
                System.out.println("Replying to client..");
                messageToClient = messageToClient.toUpperCase();

                objectOutput.writeObject(messageToClient);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }


        }

}
