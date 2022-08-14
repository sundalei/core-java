package sample.chapter7.exercise;

import java.util.Scanner;

public class GuessMe {

    public static void main(String[] args) {
        int number = 44;
        int guessNumber = 0;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.print("Your guess: ");
        guessNumber = Integer.parseInt(inputScanner.next());
        
        if (number == guessNumber) {
            System.out.println(guessNumber + "? Wow, nice guess! That was it!");
        } else if (guessNumber < number) {
            System.out.println(guessNumber + "? Ha, nice try - too low! I chose " + number + ".");
        } else {
            System.out.println(guessNumber + "? Too bad, way too high. I chose " + number + ".");
        }

        inputScanner.close();
    }
}
