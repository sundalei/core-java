package sample.inputandoutput;

import java.util.Scanner;

public class PassingTheTuringTest {

    public static void main(String[] args) {
        String name;
        String color;
        String fruit;
        int number;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Hello there!");
        System.out.print("What's your name? ");
        name = inputReader.nextLine();

        System.out.println();
        System.out.println("Hi, " + name +"! I'm Alice.");
        System.out.print("What's your favorite color? ");
        color = inputReader.nextLine();

        System.out.println();
        System.out.println("Huh, " + color + "? Mine's Electric Lime.");
        System.out.println();

        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.print("What's YOUR favorite fruit, " + name + "? ");
        fruit = inputReader.nextLine();

        System.out.println();
        System.out.println("Really? " + fruit + "? That's wild!");
        System.out.println("Speaking of favorite, what's your favorite number?");
        number = inputReader.nextInt();

        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + name + " * -7 is " + (number * -7) + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name + "!");
        inputReader.close();
    }
    
}
