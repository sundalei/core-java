package sample.chapter13;

/**
 * Printing Pairs of Elements and More
 */
public class ArrayFun6 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < numbers.length - 2; i += 3) {
            System.out.println("Pair: (" + numbers[i] + ", " + numbers[i + 1] + ")");
        }
    }
}
