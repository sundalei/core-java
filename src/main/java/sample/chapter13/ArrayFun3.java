package sample.chapter13;

/**
 * Iterating through a Two-Dimensional Array
 */
public class ArrayFun3 {

    public static void main(String[] args) {
        String[][] words = {{"One", "Two", "three", "four", "five"},
                {"red", "white", "blue"},
                {"cat", "rabbit"}};

        System.out.println("Starting...");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                System.out.println("i = " + i + " j = " + j + " is " + words[i][j]);
            }
            System.out.println("-------------------");
        }
    }
}
