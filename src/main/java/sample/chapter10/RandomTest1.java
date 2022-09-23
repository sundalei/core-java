package sample.chapter10;

import java.util.Random;

/**
 * Generate random numbers from 0 to 9 (inclusive).
 * @author leosun
 *
 */
public class RandomTest1 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i <= 10; i++) {
			int randomNumber = random.nextInt(10);
			System.out.println(randomNumber);
		}
	}
}
