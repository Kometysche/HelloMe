import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;


public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".

        writeSingleLine();
    }

    public static void writeSingleLine (String[] args) {
        List<String> content = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        content.add(name);
        Path filePath = Paths.get("my-file.txt");

        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

}