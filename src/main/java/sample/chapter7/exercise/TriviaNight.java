package sample.chapter7.exercise;

import java.util.Scanner;

public class TriviaNight {

    public static void main(String[] args) {
        int correct1 = 4;
        int correct2 = 2;
        int correct3 = 3;
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;

        int correctCount = 0;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        System.out.println();

        System.out.println("FIRST QUESTION!");
        System.out.println("What is the lowest-level programming language?");
        System.out.println("1) Source code");
        System.out.println("2) Assembly language");
        System.out.println("3) C#");
        System.out.println("4) Machine code");

        System.out.println();
        System.out.print("YOUR ANSWER: ");
        answer1 = Integer.parseInt(myScanner.nextLine());

        System.out.println();
        System.out.println("SECOND QUESTION!");
        System.out.println("Website security CAPTCHA forms are descended from the work of?");
        System.out.println("1) Grace Hopper");
        System.out.println("2) Alan Turing");
        System.out.println("3) Charles Babbage");
        System.out.println("4) Larry Page");

        System.out.println();
        System.out.print("YOUR ANSWER: ");
        answer2 = Integer.parseInt(myScanner.nextLine());

        System.out.println();
        System.out.println("LAST QUESTION!");
        System.out.println("Which of these sci-fi ships was once slated for a full-size replica in Las Vegas?");
        System.out.println("1) Serenity");
        System.out.println("2) The Battlestar Galactica");
        System.out.println("3) The USS Enterprise");
        System.out.println("4) The Millennium Falcon");

        System.out.println();
        System.out.print("YOUR ANSWER: ");
        answer3 = Integer.parseInt(myScanner.nextLine());

        if (correct1 == answer1) {
            correctCount++;
        }
        if (correct2 == answer2) {
            correctCount++;
        }
        if (correct3 == answer3) {
            correctCount++;
        }

        System.out.println();
        System.out.println("Nice job - you got " + correctCount + " correct!");

        myScanner.close();
    }
    
}
