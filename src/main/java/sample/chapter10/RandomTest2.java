package sample.chapter10;

import java.util.Random;

/**
 * Randomly selects a name from an array of names.
 * @author leosun
 *
 */
public class RandomTest2 {
	
	public static void main(String[] args) {
		Random random = new Random();
		
		String[] names = new String[] { "Alice", "Bob", "Clarice", "David", "Elizabeth" };
		int randomIndex = random.nextInt(names.length);
		String randomName = names[randomIndex];
		
		System.out.println(randomName);
	}
}
