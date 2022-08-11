package sample.inputandoutput;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        String message1;
        String message2;
        String message3;
        String message4;
        String message5;
        String message6;
        String message7;
        String message8;
        String message9;
        String message10;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Let's play MAD LIBS!");
        System.out.println();
        System.out.print("I need a noun: ");
        message1 = myScanner.nextLine();
        System.out.print("Now an adjective: ");
        message2 = myScanner.nextLine();
        System.out.print("Another noun: ");
        message3 = myScanner.nextLine();
        System.out.print("And a number: ");
        message4 = myScanner.nextLine();
        System.out.print("Another adjective: ");
        message5 = myScanner.nextLine();
        System.out.print("A plural noun: ");
        message6 = myScanner.nextLine();
        System.out.print("Another one: ");
        message7 = myScanner.nextLine();
        System.out.print("One more: ");
        message8 = myScanner.nextLine();
        System.out.print("A verb (infinitive form): ");
        message9 = myScanner.nextLine();
        System.out.print("Same verb (past participle): ");
        message10 = myScanner.nextLine();

        System.out.println();
        System.out.println("*** NOW LETS GET MAD (libs) ***");

        System.out.println(message1 + ": the " + message2 + " frontier. These are the voyages of the starship "
                + message3 + ". Its " + message4 + "-year mission: to explore strange " + message5 + " " + message6
                + ", to seek out " + message5 + " " + message7 + " and " + message5 + " " + message8 + ", to boldly "
                + message9 + " where no one has " + message10 + " before.”");

        myScanner.close();

    }
}
