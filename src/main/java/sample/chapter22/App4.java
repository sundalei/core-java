package sample.chapter22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App4 {
    
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");

        // Display List with an enhanced for loop
        for (String s : strings) {
            System.out.println(s);
        }

        // Display List with an Iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(currentString);
        }
    }
}
