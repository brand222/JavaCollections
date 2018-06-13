package collections;

import java.util.ArrayList;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		//here we are  adding items to the arrayList
		cars.add("Chevrolet");
		cars.add("bmw");
		cars.add("audi");
		cars.add("Hummer");
		cars.add("pontiac");
		System.out.println("Here are the items within the arraylist: ");
		//using enhanced for loop
		for (String car : cars) {
			System.out.println(car);
		}
		
		//getting size of arraylist
		int size = cars.size();
		System.out.println("the size of the list is: " + size);
		
		//get the index of the arraylist
		System.out.println("The item in index 1 is: " + cars.get(1));
		
		//here is another way to iterate through the array list
		System.out.println("Here is another way to loop through the array");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i) );
		}
		
		//removing items from arraylist
		//this will remove last item
		cars.remove(size -1);
		
		System.out.println("After removing: ");
		for (String car : cars) {
			System.out.println(car);
		}
	}
}
