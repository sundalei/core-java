package sample.chapter22;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        System.out.println("List size: " + strings.size());

        strings.add("The First String");
        strings.add("The Second String");
        strings.add("The Third String");

        System.out.println("List size: " + strings.size());

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        strings.add(1, "A New String");

        System.out.println("List size: " + strings.size());

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
