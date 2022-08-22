package sample.chapter8.exercise;

import java.util.Scanner;

public class ForTimes {
    
    public static void main(String[] args) {
        int number;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Which times table shall I recite? ");
        number = Integer.parseInt(myScanner.nextLine());

        for (int i = 0; i < 15; i++) {
            System.out.println((i + 1) + " * " + number + " is: " + (i + 1) * number);
        }

        myScanner.close();

    }
}
