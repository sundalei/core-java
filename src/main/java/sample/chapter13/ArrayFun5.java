package sample.chapter13;

/**
 * Going Backward in an Array
 */
public class ArrayFun5 {

    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 1, 10, 42};
        // start at last index, go to the first
        for (int ctr = numbers.length - 1; ctr >= 0; ctr--) {
            if (ctr % 2 == 1) {
                System.out.println("index " + ctr + " - " + numbers[ctr]);
            }
        }
    }
}
