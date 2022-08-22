package sample.chapter8.exercise;

import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        int number = 44;
        int guessNumber = 0;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        guessNumber = Integer.parseInt(inputScanner.next());
        System.out.println();
        
        if (number == guessNumber) {
            System.out.println(guessNumber + "? Wow, nice guess! That was it!");
        } else {

            while (number != guessNumber) {
                if (guessNumber < number) {
                    System.out.println("Ha, nice try - too low! Try again!");
                } else {
                    System.out.println("? Too bad, way too high. Try again!");
                }

                System.out.print("Your guess: ");
                guessNumber = Integer.parseInt(inputScanner.next());
                System.out.println();
            }
            System.out.println();
            System.out.println("Finally! It's about time you got it!");
        }

        inputScanner.close();
    }
}
