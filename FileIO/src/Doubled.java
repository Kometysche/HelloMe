import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Doubled {

    public static void main(String[] args) {
        // Create a method called decryptDoubled() that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should return this message: File not found
        // The (decrypted) result should be saved in the output.txt file

        decryptDoubled();

    }

    public static void decryptDoubled(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter filename: ");
        String  filename = scanner.nextLine();

        List<String> content = new ArrayList();


    }
}