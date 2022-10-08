package sample.chapter13.exercise;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        int[] wholeNumbers = new int[24];

        // Combining code should go here!
        for (int i = 0; i < 12; i++) {
            wholeNumbers[i] = firstHalf[i];
            wholeNumbers[i + 12] = secondHalf[i];
        }
        // Printing code should go here
        for (int i = 0; i < 24; i++) {
            System.out.print(wholeNumbers[i] + " ");
        }
    }
}
