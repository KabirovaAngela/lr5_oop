import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to start a server or a client? (S/C)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("S")) {
            ChatServer.main(null);
        } else if (choice.equalsIgnoreCase("C")) {
            ChatClient.main(null);
        } else {
            System.out.println("Invalid choice. Please enter 'S' for server or 'C' for client.");
        }

        scanner.close();
    }
}