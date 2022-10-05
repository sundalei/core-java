package sample.chapter13;

/**
 * Summing Values in an Array
 */
public class ArrayFun4 {

    public static void main(String[] args) {

        int[] numbers = {3, 5, 2, 1, 10, 42};
        int sum = 0;
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            sum += numbers[ctr];
            System.out.println("ctr = " + ctr + " current sum = " + sum);
        }
        System.out.println("Final sum: " + sum);
    }
}
