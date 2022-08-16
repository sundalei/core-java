package sample.chapter7.exercise;

import java.util.Scanner;

public class FieldDay {
    
    public static void main(String[] args) {
        
        String lastName = "";
        String team = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What's your last name? ");
        lastName = myScanner.nextLine();

        if (lastName.compareTo("Baggins") < 0) {
            team = "Red Dragons";
        } else if (lastName.compareTo("Baggins") >= 0 && lastName.compareTo("Dresden") < 0) {
            team = "Dark Wizards";
        } else if (lastName.compareTo("Dresden") >= 0 && lastName.compareTo("Howl") < 0) {
            team = "Moving Castles";
        } else if (lastName.compareTo("Howl") >= 0 && lastName.compareTo("Potter") < 0) {
            team = "Golden Snitches";
        } else if (lastName.compareTo("Potter") >= 0 && lastName.compareTo("Vimes") < 0) {
            team = "Night Guards";
        } else if (lastName.compareTo("Vimes") >= 0) {
            team = "Black Holes";
        }

        System.out.println("Aha! You're on the team \"" + team + "\"!");
        System.out.println("Good luck in the games!");
        myScanner.close();
    }
}
