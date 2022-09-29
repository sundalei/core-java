package sample.chapter11.exercise;

/**
 * Using for to Display Odd Numbers
 * @author leosun
 *
 */
public class CountingNumbers {
	
	public static void main(String[] args) {
		
		int counter;
		
		for (counter = 0; counter < 21; counter = counter + 2) {
			System.out.println(counter);
		}
		
		System.out.println("...Done!");
	}
}
