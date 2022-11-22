import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    // Write a function that copies the contents of a file into another file
    // It should take two filenames (string) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows if the copy was successful

    public static void main(String[] args) {
        copyFile();
    }

    public static void copyFile(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter path and name of source file: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Please enter path and name of target file: ");
        String targetFile = scanner.nextLine();

        List<String> content = new ArrayList();



    }
}
