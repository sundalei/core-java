package sample.chapter13;

/**
 * Changing an Array's Size
 */
public class ArrayFun7 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ctr = " + i + " current value = " + numbers[i]);
        }
        System.out.println("Number of items: " + numbers.length);
        System.out.println("------------------------------------");
        numbers = growArray(numbers, 5);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("ctr = " + i + " current value = " + numbers[i]);
        }
        System.out.println("Number of items: " + numbers.length);
    }

    public static int[] growArray(int[] original, int howManyMoreElements) {
        int[] newArray = new int[original.length + howManyMoreElements];

        for (int i = 0; i < original.length; i++) {
            // copy the element at the current index from original to newArray
            newArray[i] = original[i];
        }

        return newArray;
    }
}
