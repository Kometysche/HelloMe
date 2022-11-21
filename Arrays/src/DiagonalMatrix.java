import java.util.Arrays;
import java.util.Scanner;
public class DiagonalMatrix {
    public static void main(String[] args) {
        // Write a program that asks for an integer n,
        // then it creates a two-dimensional array (of integers) of the specified
        // size (nxn) with the value of 1 on the main diagonal and the value of 0
        // everywhere else. Print the 2d array into the output
        //
        // Example:
        //
        // Please enter the array (matrix) size: 4
        // 1 0 0 0
        // 0 1 0 0
        // 0 0 1 0
        // 0 0 0 1


        //int[][] matrix = create(size);
        //print(matrix);
    }

    public static int[][] create(int size) {
        // write your code to create an nxn matrix
        // of the given size here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the array (matrix) size: ");
        int n = scanner.nextInt();

        int matrix2[n][n];

    }

    public static void print(int[][] matrix) {
        // write your code to print the given matrix
        // into the (standard) output here
    }
}
