package sample.inputandoutput;

import java.util.Scanner;

public class QuestForTheUserInput {

    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String yourName;
        String yourQuest;
        double velocityOfSwallow;

        // we can use the scanner's readline to assign value to our strings
        // because its return type is tring
        System.out.print("What is your name?");
        yourName = inputReader.nextLine();

        System.out.print("What is your quest?!");
        yourQuest = inputReader.nextLine();

        // when we get to our double data type, we can use Scanner's nextdouble method
        // or we can use the double.parsedouble to convert the nextline's string
        System.out.print("What is the airspeed velocity of an unladen swallow?!?!");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " +
                yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");

        inputReader.close();
    }

}
