import java.util.Scanner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        System.out.print("a = ");
        int a = scanner.nextInt();
        int output1 = 0;
        // if the value of 'a' is even increment output1 by one
        if (a % 2 == 1) {
            System.out.println("Output #1: " + output1);
        } else {
            output1 = output1 + 1;
            System.out.println("Output #1: " + output1);
        }



        System.out.println("Please enter an integer between 0 and 30: ");
        System.out.print("b = ");
        int b = scanner.nextInt();
        String output2 = "Less!";
        // if b is between 10 and 20 set output2 to "Sweet!"
        // if less than 10 set output2 to "Less!",
        // if more than 20 set output2 to "More!"
        if (b < 10) {
            System.out.println("Output #2: " + output2);
        } else if (b <= 20) {
            output2 = "Sweet!";
            System.out.println("Output #2: " + output2);
        } else {
            output2 = "More!";
            System.out.println("Output #2: " + output2);
        }


        System.out.println("Please enter an integer between 0 and 100: ");
        System.out.print("credits = ");
        int credits = scanner.nextInt();

        System.out.println("Please enter a boolean (true/false): ");
        System.out.print("isBonus = ");
        boolean isBonus = scanner.nextBoolean();

        int output3 = 123;
        // if credits are at least 50,
        // and isBonus is false decrement output3 by 2
        // if credits are smaller than 50,
        // and isBonus is false decrement output3 by 1
        // if isBonus is true output3 should remain the same
        if (isBonus) {
            System.out.println("Output #3: " + output3);
        } else if (credits > 50) {
            output3 -= 2;
            System.out.println("Output #3: " + output3);
        } else {
            output3 -= 1;
            System.out.println("Output #3: " + output3);
        }


        System.out.println("Please enter an integer between 0 and 50: ");
        System.out.print("d = ");
        int d = scanner.nextInt();

        System.out.println("Please enter an integer between 0 and 500: ");
        System.out.print("time = ");
        int time = scanner.nextInt();

        String output4 = "Time out";
        // if d is dividable by 4 and time is not more than 200
        // set output4 to "Check"
        // if time is more than 200
        // set output4 to "Time out"
        // otherwise set output4 to "Run Forest Run!"

        if (time > 200) {
            System.out.println("Output #4: " + output4);
        } else if (d % 4 == 0) {
            output4 = "Check";
            System.out.println("Output #4: " + output4);
        } else {
            output4 = "Run Forest Run!";
            System.out.println("Output #4: " + output4);
        }
    }
}
