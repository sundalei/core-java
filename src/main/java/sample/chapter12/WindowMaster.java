package sample.chapter12;

import java.util.Scanner;

public class WindowMaster {
	
	public static void main(String[] args) {
		// declare variables for height and width
		float height;
		float width;
		
		// declare other variables
		float areaOfWindow;
		float cost;
		float perimeterWindow;
		
		// get input from the user
		height = readValue("Please enter window height:");
		width = readValue("Please enter window width:");
		
		// calculate the area of the window
		areaOfWindow = height * width;
		
		// calculate the perimeter of the window
		perimeterWindow = 2 * (height + width);
		
		// calculate the total cost - use a hard-coded value for meterial cost
		cost = ((3.50f * areaOfWindow) + (2.25f * perimeterWindow));
		
		// display the results to the user
		System.out.println("Window height = " + height);
		System.out.println("Window width = " + width);
		System.out.println("Window area = " + areaOfWindow);
		System.out.println("Window perimeter = " + perimeterWindow);
		System.out.println("Total Cost = " + cost);
		
	}
	
	public static float readValue(String prompt) {
		
		// declare and initialize a Scanner variable
		Scanner myScanner = new Scanner(System.in);
		
		//print prompt to Console
		System.out.println(prompt);
		
		// read value into String data type
		String input = myScanner.nextLine();
		
		// convert the String to a float
		float floatVal = Float.parseFloat(input);
		
		// return the float value
		return floatVal;
	}
}
