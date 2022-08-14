package sample.chapter7.exercise;

import java.util.Scanner;

public class BirthStones {

    public static void main(String[] args) {
        int month = 0;
        String displayMonth = "";
        String displayBirthStone = "";
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What month's birthstone do you want to know? ");
        month = Integer.parseInt(myScanner.nextLine());

        if (month == 1) {
            displayMonth = "January";
            displayBirthStone = "Garnet";
        } else if (month == 2) {
            displayMonth = "February";
            displayBirthStone = "Amethyst";
        } else if (month == 3) {
            displayMonth = "March";
            displayBirthStone = "Aquamarine";
        } else if (month == 4) {
            displayMonth = "April";
            displayBirthStone = "Diamond";
        } else if (month == 5) {
            displayMonth = "May";
            displayBirthStone = "Emerald";
        } else if (month == 6) {
            displayMonth = "June";
            displayBirthStone = "Pearl";
        } else if (month == 7) {
            displayMonth = "July";
            displayBirthStone = "Ruby";
        } else if (month == 8) {
            displayMonth = "August";
            displayBirthStone = "Peridot";
        } else if (month == 9) {
            displayMonth = "September";
            displayBirthStone = "Sapphire";
        } else if (month == 10) {
            displayMonth = "October";
            displayBirthStone = "Opal";
        } else if (month == 11) {
            displayMonth = "November";
            displayBirthStone = "Topaz";
        } else if (month == 12) {
            displayMonth = "December";
            displayBirthStone = "Turquoise";
        } 

        if (displayMonth.equals("")) {
            System.out.println("I think you must be confused, " + month + " doesn't match a month.");
        } else {
            System.out.println(displayMonth + "'s birthstone is " + displayBirthStone);
        }

        myScanner.close();
    }
    
}
