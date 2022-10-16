package sample.chapter23;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsExample {
    
    public static void main(String[] args) {
        
        Map<String, Integer> populations = new HashMap<>();

        populations.put("USA", 328000000);
        populations.put("Canada", 37590000);
        populations.put("United Kingdom", 66800000);
        populations.put("Japan", 126000000);

        System.out.println("Map size is: " + populations.size());
        System.out.println("---------------------------------");

        Integer japanPopulation = populations.get("Japan");
        System.out.println("The population of Japan is: " + japanPopulation);

        Integer ASDFPopulation = populations.get("ASDF");
        System.out.println("The population of ASDF is: " + ASDFPopulation);
        System.out.println("---------------------------------");

        // Update the USA
        populations.put("USA", 328000002);

        // Get the Set of keys from the map
        Set<String> keys = populations.keySet();

        // Print the keys to the screen
        for (String k : keys) {
            System.out.println("The population of " + k + " is " + populations.get(k));
        }
        System.out.println("---------------------------------");

        Set<Map.Entry<String, Integer>> entries = populations.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("The population of " + entry.getKey() + " is " + entry.getValue());
        }
        System.out.println("---------------------------------");

        // get the Collection of values from the Map
        Collection<Integer> populationValues = populations.values();

        // list all of the population values
        for (Integer currentPopulation : populationValues) {
            System.out.println(currentPopulation);
        }
    }
}
