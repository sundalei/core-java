package sample.chapter22.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MixedUpAnimals {
    
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String line = null;

        System.out.print("Enter a anmial type(enter quit to quit the program): ");

        while (!(line = scanner.nextLine()).startsWith("q")) {
            
            int position = 0;
            for (position = 0; position < strings.size(); position++) {
                if (line.compareToIgnoreCase(strings.get(position)) < 0) {
                    break;
                }
            }

            strings.add(position, line);

            System.out.println();

            System.out.println("Animal in the list:");
            for (String animal : strings) {
                System.out.println(animal);
            }

            System.out.println();

            System.out.print("Enter a anmial type(enter quit to quit the program): ");
        }

        scanner.close();
    }
}
