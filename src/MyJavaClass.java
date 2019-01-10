
import java.util.Arrays;

public class MyJavaClass {

    public static void main(String[] args) {
        System.out.print("Array before sort: " + Arrays.toString(args));

    }
    
    public static void sort(int[] arrayToSort) {
        int indexMin;
        for (int index = 0; index < arrayToSort.length - 1; index++) {
            indexMin = index;
            for (int indexToScan = index; indexToScan < arrayToSort.length; indexToScan++) {
                if (arrayToSort[indexMin] > arrayToSort[indexToScan]) {
                    indexMin = indexToScan;
                }
            }
            int temp = arrayToSort[index];
            arrayToSort[index] = arrayToSort[indexMin];
            arrayToSort[indexMin] = temp;
            Arrays.toString(arrayToSort);
        }
    }

    
}

