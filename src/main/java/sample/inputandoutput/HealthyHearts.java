package sample.inputandoutput;

import java.util.Scanner;

public class HealthyHearts {
    
    public static void main(String[] args) {
        int age;
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        age = myScanner.nextInt();
        int maximumRate = 220 - age;
        int minRange = maximumRate * 50 / 100;
        int maxRange = maximumRate * 85 / 100;
        System.out.println("Your maximum heart rate should be " + maximumRate + " beats per minute.");
        System.out.println("Your target HR Zone is " + minRange + " - " + maxRange + " beats per minute.");

        myScanner.close();
    }
}
