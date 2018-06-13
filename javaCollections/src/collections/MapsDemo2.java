package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo2 {

	public static void main(String[] args) {
		//Hashmap - Does not maintain any order
		Map<Integer, String> Hashmap = new HashMap<Integer, String>();
		
		Hashmap.put(1, "BMW");
		Hashmap.put(3, "Audi");
		Hashmap.put(2, "Chevrolet");
		Hashmap.put(9, "Mercury");
		System.out.println("Iteration 1");
		
		for (Map.Entry<Integer, String> entry : Hashmap.entrySet() ) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("The key is: " + key + "\nThe value is: " + value );
		}
		
		System.out.println("Iteration 2");
		for (Integer key : Hashmap.keySet()) {
			String value = Hashmap.get(key);
			System.out.println("The key is: " + key + "\nThe value is: " + value );
		}
		
		//maintain the order for which things are added
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();
		System.out.println("Iteration 3");
		linkedMap.put(1, "BMW");
		linkedMap.put(3, "Audi");
		linkedMap.put(2, "Chevrolet");
		linkedMap.put(9, "Mercury");
		for (Integer key : linkedMap.keySet()) {
			String value = linkedMap.get(key);
			System.out.println("The key is: " + key + "\nThe value is: " + value );
		}
		
		//maintains natural sorting order (alphabetical/numerical)
		Map<Integer, String> TreeMap = new TreeMap<Integer, String>();
		System.out.println("Iteration 4");
		TreeMap.put(1, "BMW");
		TreeMap.put(3, "Audi");
		TreeMap.put(2, "Chevrolet");
		TreeMap.put(9, "Mercury");
		for (Integer key : TreeMap.keySet()) {
			String value = TreeMap.get(key);
			System.out.println("The key is: " + key + "\nThe value is: " + value );
		}
	}
}
