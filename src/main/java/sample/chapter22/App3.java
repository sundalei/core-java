package sample.chapter22;

import java.util.ArrayList;
import java.util.List;

public class App3 {
    
    public static void main(String[] args) {
        
        List<String> strings = new ArrayList<>();

        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");
        strings.add("Date");

        for (String currentString : strings) {
            System.out.println(currentString);
        }
    }
}
