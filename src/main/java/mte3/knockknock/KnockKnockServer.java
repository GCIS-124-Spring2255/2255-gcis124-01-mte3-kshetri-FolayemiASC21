// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockServer.java (inside knockknock package)

package mte3.knockknock;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class KnockKnockServer {
    public static int PORT = 54322;

    public static void receiveAndSend(Scanner scanner, String message, PrintWriter writer, boolean concat) {
        String received = scanner.nextLine();
        System.out.println("Client: " + received);
        
        if (concat) {
            writer.println(received + " " + message);
        } else {
            writer.println(message);
        }
    } // receiveAndSend() method closed
    
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("KnockKnockServer is running on port " + PORT);
        
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected: " + clientSocket.getInetAddress());
        
        Scanner scanner = new Scanner(clientSocket.getInputStream());
        PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
        
        receiveAndSend(scanner, "Who's there?", writer, false);
        receiveAndSend(scanner, "", writer, true);
        receiveAndSend(scanner, "who?", writer, true);
        receiveAndSend(scanner, "Haha! Good one!", writer, false);
        
        writer.close();
        scanner.close();
        clientSocket.close();
        serverSocket.close();
    } // main() method closed
}