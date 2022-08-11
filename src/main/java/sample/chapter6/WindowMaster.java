package sample.chapter6;

import java.util.Scanner;

public class WindowMaster {

    public static void main(String[] args) {
        // declare variables for height and width
        float height;
        float width;

        // declare String variables to hold the user's height and width input
        String stringHeight;
        String stringWidth;

        // declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // declare two variables regarding cost
        float price1;
        float price2;

        // declare and initialize the Scanner
        Scanner myScanner = new Scanner(System.in);

        // get input from the user
        System.out.println("Please enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter window width:");
        stringWidth = myScanner.nextLine();

        // convert String values of height and width to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // calculate the area of the window
        areaOfWindow = height * width;

        // calculate the perimeter of the window
        perimeterOfWindow = (height + width) * 2;

        // get input for cost 
        System.out.println("Please enter price1: ");
        price1 = Float.parseFloat(myScanner.nextLine());
        System.out.println("Please enter price2: ");
        price2 = Float.parseFloat(myScanner.nextLine());

        // calculate the total cost
        cost = price1 * areaOfWindow + price2 * perimeterOfWindow;

        // display the result to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);

        myScanner.close();
    }
}
