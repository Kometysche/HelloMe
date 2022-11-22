import java.util.Scanner;

public class Doubling {
    // - Create an integer variable named `baseNumber` and
    //   assign it the value of `123`
    // - Create a function called `doubleNumber()` that doubles
    //   its integer input parameter and returns that doubled value
    // - Print the result of `doubleNumber(baseNumber)`
    public static void main(String[] args) {
        int baseNumber = 123;
        doubleNumber();
    }

    private static void doubleNumber() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input * 2);
    }

   }
