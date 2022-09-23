package sample.chapter10;

import java.util.Random;
import java.util.Scanner;

/**
 * A guessing game where a player tries to guess a number between 1 and 20, inclusively.
 * @author leosun
 *
 */
public class GuessingGame {
	
	public static void main(String[] args) {
		// declare the number variables and initialize to 0
		int answer = 0;
		int guess = 0;
		
		// set up our random range variable
		Random random = new Random();
		
		// declare and initialize a Scanner object
		Scanner myScanner = new Scanner(System.in);
		
		// Generate a random number between 1 and 20
		answer = random.nextInt(20) + 1;
		
		// Now start getting guesses!
		while (true) {
			// Get a guess!
			System.out.println("Please guess a number between 1 and 20: ");
			guess = myScanner.nextInt();
			
			// Does the guess equal the answer?
			if (guess == answer) {
				break;
			} else if (guess < 1 || guess > 20) {
				System.out.println("Enter a guess between 1 and 20.");
				continue;
			}
			
			if (guess > answer) {
				System.out.println("Guess is too high. Pick a lower number!");
				continue;
			}
			System.out.println("Guess is too low. Pick a higher number!");
		}
		
		System.out.println("You got it! The answer was: " + answer);
		
		myScanner.close();
		
	}
}
