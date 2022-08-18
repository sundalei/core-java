package sample.chapter8;

public class CountingNumbers {

    public static void main(String[] args) {

        // int counter = 1;

//        while (counter <= 5) {
//            System.out.println("Counting: " + counter);
//            counter++;
//        }

        // do {
        //     System.out.println("Counting: " + counter);
        //     counter++;
        // } while (counter <= 5);

        // Using for to Count to 5
        // int counter;
        // for (counter = 1; counter <= 5; counter++) {
        //     System.out.println("Counting: " + counter);
        // }

        // Using for to Display Odd Numbers

        int counter;

        for (counter = 2; counter < 21; counter = counter + 2) {
            System.out.println(counter);
        }

        System.out.println("...Done!");
    }
}
