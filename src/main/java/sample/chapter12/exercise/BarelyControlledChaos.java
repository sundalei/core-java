package sample.chapter12.exercise;

import java.util.Random;

public class BarelyControlledChaos {

	public static void main(String[] args) {

		String color = chooseColor(); // call color method here
		String animal = chooseAnimal(); // call animal method again here
		String colorAgain = chooseColor(); // call color method again here
		int weight = chooseNumber(50, 100); // call number method,
		// with a range between 5 - 200
		int distance = chooseNumber(50, 100); // call number method,
		// with a range between 10 - 20
		int number = chooseNumber(50, 100); // call number method,
		// with a range between 10000 - 20000
		int time = chooseNumber(50, 100); // call number method,
		// with a range between 2 - 6

		System.out.println("Once, when I was very small…");

		System.out.println("I was chased by a " + color + ", " + weight + "lb " + " miniature " + animal + " for over "
				+ distance + " miles!!");

		System.out.println("I had to hide in a field of over " + number + " " + colorAgain + " poppies for nearly "
				+ time + " hours until it left me alone!");

		System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
	}

	public static String chooseColor() {
		String[] colors = { "red", "green", "blue", "orange", "purple" };

		Random random = new Random();
		int index = random.nextInt(colors.length);
		return colors[index];
	}

	public static String chooseAnimal() {
		String[] colors = { "pig", "chicken", "ox", "horse", "fish" };

		Random random = new Random();
		int index = random.nextInt(colors.length);
		return colors[index];
	}

	public static int chooseNumber(int min, int max) {

		Random random = new Random();
		int number = random.nextInt(0, max + 1) + min;
		return number;
	}
}
