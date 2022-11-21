import java.util.Scanner;



public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the triangle height: ");
        draw(input.nextInt());


    }

    public static void draw (int height) {
        // Write your code to draw the triangle here


        int asterix = 0;

        while (asterix < height) {
            int innerLoop = 0;
            int numberOfStars = asterix + 1;
            while (innerLoop < numberOfStars) {
                System.out.print("*");
                innerLoop++;
            }
            System.out.println();
            asterix++;
        }
    }
}
