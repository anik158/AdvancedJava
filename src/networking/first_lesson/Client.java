package networking.first_lesson;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("Client started..");
        Socket cleintSocket = new Socket("127.0.0.1",22222);
        System.out.println("Client connected..");




        ObjectOutputStream objectOutput = new ObjectOutputStream(cleintSocket.getOutputStream());
        ObjectInputStream objInput = new ObjectInputStream(cleintSocket.getInputStream());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Say somethig to the server: ");
        String sedingToServer = scanner.nextLine();

        objectOutput.writeObject(sedingToServer);


        try {
            Object message = objInput.readObject();

            System.out.println("Server says: "+(String)message);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
