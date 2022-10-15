package sample.chapter22;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");
        System.out.println("List size: " + strings.size());

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        strings.remove("Banana");

        System.out.println("List size: " + strings.size());

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
