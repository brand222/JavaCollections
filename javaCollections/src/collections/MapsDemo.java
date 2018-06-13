package collections;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	
	public static void main(String[] args) {
		// Stores in key - value pairs = 1 entry
		//notice in the type of map we create, we are passing 2 parameters: {Key} and {Value}
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		//adding values to the HashMap
		map.put(1, "BMW");
		map.put(2, "audi");
		map.put(2, "COW");
		map.put(6, "Honda");
		
		//keys are ALWAYS unique, values can be duplicated
//		String value1 = map.get(1);
//		System.out.println(value1);
		
		//notice when we duplicate a value, it will override the existing value to key 2
		String value2 = map.get(2);
		System.out.println(value2);
		
	}
}
