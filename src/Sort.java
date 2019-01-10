
import java.util.Arrays;
import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(10) + 1;
        }
        
        System.out.println("Array before sort: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Array after sort: " + Arrays.toString(numbers));

    }
}
