package bookingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visits {
	public static void tour(String number) {
		Map<String, List<String>> map = new HashMap<>();

        // Add values to the Map
        String key = "1";
        List<String> Rubavu = new ArrayList<>();
        Rubavu.add("\tLocation: Rubavu");
        Rubavu.add("\tPlace: kivu");
        Rubavu.add("\tDate: 17/6/2023");
        
        String key1 = "2";
        List<String> Musanze = new ArrayList<>();
        Musanze.add("\tLocation: Musanze");
        Musanze.add("\tPlace: virunga");
        Musanze.add("\tDate: 30/6/2023");
        
        String key2 = "3";
        List<String> Nunga = new ArrayList<>();
        Nunga.add("\tLocation: Ntunga");
        Nunga.add("\tPlace: Muhazi");
        Nunga.add("\tDate: 20/7/2023");
        
        String key3 = "4";
        List<String> Rukozo = new ArrayList<>();
        Rukozo.add("\tLocation:Rulindo");
        Rukozo.add("\tPlace: Rwiri, Rukozo");
        Rukozo.add("\tDate: 20/7/2023__21/7/2023");
        
        map.put(key, Rubavu);
        map.put(key1, Musanze);
        map.put(key2, Nunga);
        map.put(key3, Rukozo);

        // Retrieve values associated with the key
        List<String> retrievedList = map.get(number);
        
        // Print the values
        for (String fruit : retrievedList) {
            System.out.println(fruit);
        }
	}
}
