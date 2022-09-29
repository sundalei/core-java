package sample.chapter11.exercise;

/**
 * A Simple Question of If
 * @author leosun
 *
 */
public class Looper {
	
	public static void main(String[] args) {
		
		int counter = 10;
		
		for (int looper = 1; looper < 10; looper++) {
			if (counter < 10) {
				// put a break point on the following line.
				System.out.println("Counter is less than 10!");
			} else {
				System.out.println("Counter is greater or equal to 10!");
			}
			
			System.out.println(counter);
		}
	}
}
