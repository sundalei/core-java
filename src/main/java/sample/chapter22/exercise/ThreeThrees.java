package sample.chapter22.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThreeThrees {
    
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        strings.add("Four");
        strings.add("Five");
        strings.add("Six");
        strings.add("Three");
        strings.add("Seven");
        strings.add("Three");
        strings.add("Eight");

        // Display strings with an enhanced loop
        for (String currentString : strings) {
            System.out.println(currentString);
        }

        System.out.println("---------------------------------");

        Iterator<String> iterator = strings.iterator();
        int count = 0;

        while (iterator.hasNext()) {
            String currentString = iterator.next();
            if (currentString.equals("Three")) {
                count++;
                if (count == 1) {
                    continue;
                }
                System.out.println("remove element");
                iterator.remove();
            }
            
        }

        System.out.println("---------------------------------");

        // Display strings with an enhanced loop
        for (String currentString : strings) {
            System.out.println(currentString);
        }
    }
}
