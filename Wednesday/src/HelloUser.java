import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please entre your name: John Doe
        // Hello, John Doe!
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entre your name: ");
        String userInput1 = scanner.nextLine();


        System.out.println("Hello, " + userInput1 + "!");
    }
}

