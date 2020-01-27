
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] copiedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }

        return copiedArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverseCopiedArray = new int[array.length];

        for (int i = array.length; i > 0; i--) {
            System.out.println(i);
            reverseCopiedArray[array.length - i] = array[i - 1];
        }

        return reverseCopiedArray;
    }

}
