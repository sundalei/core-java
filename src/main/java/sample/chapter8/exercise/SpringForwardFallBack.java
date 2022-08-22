package sample.chapter8.exercise;

public class SpringForwardFallBack {

    public static void main(String[] args) {

        System.out.println("It's Spring...!");
        for (int i = 0; i < 10; i++) {
            if (i < 9) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            if (i > 1) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }
}
