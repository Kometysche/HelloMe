import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders`
        // - Print the 'swapped' array into the console:
        //   [third, second, first]

        String[] orders = {"first", "second", "third"};
                Arrays.sort(orders,
                Comparator.comparing(String::toString).reversed());

        System.out.println(Arrays.toString(orders));
    }
}
