package sample.chapter10.exercise;

import java.util.Random;
import java.util.Scanner;

public class HighRoller {

	public static void main(String[] args) {
		Random diceRoller = new Random();
		Scanner myScanner = new Scanner(System.in);
		int sides = 0;
		
		System.out.print("How many slides a single die has.");
		sides = myScanner.nextInt();

		int rollResult = diceRoller.nextInt(sides) + 1;

		System.out.println("TIME TO ROOOOOOLL THE DIE!");
		System.out.println("I rolled a " + rollResult);

		if (rollResult % 2 == 0) {
			System.out.println("You rolled an even number!");
		}
		
		if (rollResult == sides) {
			System.out.println("You rolled a critical! Nice job!");
		}
		
		myScanner.close();
	}
}
