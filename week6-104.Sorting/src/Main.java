
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        return array[indexOfTheSmallest(array)];
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);

    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;
        
        for (int i = index; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }

    public static void swap(int[] array, int index1, int index2) {
        int firstIndexValue = array[index1];
        int secondIndexValue = array[index2];

        array[index1] = secondIndexValue;
        array[index2] = firstIndexValue;

    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestCurrentIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestCurrentIndex);
        }
    }

}
