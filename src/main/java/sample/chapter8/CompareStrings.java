package sample.chapter8;

import java.util.Scanner;

public class CompareStrings {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber;
        String userNumberString;

        do {
            System.out.println("Please enter a number between 1 and 20: ");
            userNumberString = scanner.nextLine();
            userNumber = Integer.parseInt(userNumberString);
        } while (userNumber < 1 || userNumber > 20);

        System.out.println("Thank you!!! Your number was: " + userNumber);
        scanner.close();
    }
}
