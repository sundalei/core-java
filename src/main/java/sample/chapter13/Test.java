package sample.chapter13;

public class Test {
    public static void main(String[] args) {
        int rows = 2;
        int columes = 3;
        int[][] table = new int[rows][columes];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columes; j++) {
                System.out.println(table[i][j]);
            }
        }

        System.out.println("------");

        int[][] autoInitTable = {{ 5, 3, 1}, {2, 4, 6}};

        for (int i = 0; i < autoInitTable.length; i++) {
            for (int j = 0; j < autoInitTable[i].length; j++) {
                System.out.println(autoInitTable[i][j]);
            }
        }

        System.out.println("------");

        int[][] jagged = new int[3][];
        jagged[0] = new int[] { 1, 2 };
        jagged[1] = new int[] { 3, 4, 5, 6 };
        jagged[2] = new int[] { 7, 8, 9 };

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.println(jagged[i][j]);
            }
        }
    }
}
