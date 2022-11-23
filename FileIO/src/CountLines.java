import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner

public class CountLines {
    public static void main(String[] args) {
        countLines();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter filename: ");
        String filename = scanner.Line();
    }

    // Write a function called countLines() that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.


    public static void countLines(String[] args) {
        Path filePath = Paths.get("assets/lorem-ipsum.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.get(0)); // Prints the first line of the file
        } catch (IOException e) {
            System.out.println("0");
        }

    }
}
