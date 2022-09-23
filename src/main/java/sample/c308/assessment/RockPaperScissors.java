package sample.c308.assessment;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int rounds = 0;
        int userChoice = 0;
        int computerChoice = 0;

        int tieTimes = 0;
        int userWinTimes = 0;
        int computerWinTimes = 0;

        String playAgagin;

        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            tieTimes = 0;
            userWinTimes = 0;
            computerWinTimes = 0;
            
            System.out.println("How many rounds do you want to play? (1-10)");
            try {
                rounds = myScanner.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("Input incorrect! Please Input number between 1 and 10");
                return;
            }

            if (rounds < 1 || rounds > 10) {
                System.err.println("Input round number incorrect! Please Input number between 1 and 10");
                return;
            }

            for (int i = 0; i < rounds; i++) {
                System.out.println("Your choice (1 = Rock, 2 = Paper, 3 = Scissors)");
                userChoice = myScanner.nextInt();

                computerChoice = random.nextInt(3) + 1;

                if (userChoice == computerChoice) {
                    System.out.println("tie");
                    tieTimes++;
                } else if (userChoice == 1) {
                    if (computerChoice == 2) {
                        System.out.println("computer win");
                        computerWinTimes++;
                    } else if (computerChoice == 3) {
                        System.out.println("user win");
                        userWinTimes++;
                    }
                } else if (userChoice == 2) {
                    if (computerChoice == 1) {
                        System.out.println("user win");
                        userWinTimes++;
                    } else if (computerChoice == 3) {
                        System.out.println("computer win");
                        computerWinTimes++;
                    }
                } else if (userChoice == 3) {
                    if (computerChoice == 1) {
                        System.out.println("computer win");
                        computerWinTimes++;
                    } else if (computerChoice == 2) {
                        System.out.println("user win");
                        userWinTimes++;
                    }
                }
            }

            System.out.println("tie number: " + tieTimes);
            System.out.println("user win number: " + userWinTimes);
            System.out.println("computer win number: " + computerWinTimes);

            if (userWinTimes > computerWinTimes) {
                System.out.println("you win");
            } else if (userWinTimes == computerWinTimes) {
                System.out.println("tie");
            } else {
                System.out.println("computer win");
            }

            System.out.println("Do you want to play again? (y/n)");
            playAgagin = myScanner.next();
            System.out.println(playAgagin);
            if (playAgagin.endsWith("n")) {
                break;
            }
        } 

        System.out.println("Thanks for playing");

    }

}
