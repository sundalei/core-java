package sample.chapter8.exercise;

import java.util.Scanner;

public class DoOrDoNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true;
        } else {
            doIt = false;
        }

        boolean isDidIt = false;

        // do {
        //     isDidIt = true;
        //     break;
        // } while (doIt);

        while (doIt) {
            isDidIt = true;
            break;
        }

        if (doIt && isDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && isDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }

        input.close();
    }
}
