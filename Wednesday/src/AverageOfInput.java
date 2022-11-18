import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program promots the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int first = scanner.nextInt();

        System.out.println("Please enter a number: ");
        int second = scanner.nextInt();

        System.out.println("Please enter a number: ");
        int third = scanner.nextInt();

        System.out.println("Please enter a number: ");
        int forth = scanner.nextInt();

        System.out.println("Please enter a number: ");
        int fifth = scanner.nextInt();

        int sum = (first + second + third + forth + fifth);
        double avg = (sum / 5);
        System.out.println("Sum: " + sum + ", Average: " + avg);

    }
}