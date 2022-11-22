import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.lang.String;

public class countLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.
        countLines();
    }

    public static void countLines(String[] args) {
        Path filePath = Paths.get("my-file.txt");
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println(lines.stream().count());
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }

    }


}
