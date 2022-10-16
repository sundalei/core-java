package sample.chapter23.exercise;

import java.util.HashMap;
import java.util.Map;

public class StateCapitals {
    public static void main(String[] args){

        Map<String, String> stateCapitalMap = new HashMap<>(StateCapitalsExtractor.extract());

        // Print States
        System.out.println("STATES:");
        System.out.println("========");
        for (String state : stateCapitalMap.keySet()) {
            System.out.println(state);
        }

        // Print capitals
        System.out.println("CAPITALS");
        System.out.println("========");
        for (String capital : stateCapitalMap.values()) {
            System.out.println(capital);
        }

        // Print state and capital pairs
        System.out.println("STATE/CAPITAL PAIRS");
        System.out.println("========");
        for (Map.Entry<String, String> entry : stateCapitalMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}