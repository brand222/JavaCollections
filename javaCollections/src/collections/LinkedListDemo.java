package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();
		//here we are  adding items
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
		
		//getting size
		int size = cars.size();
		System.out.println("the size of the list is: " + size);
		
		//get the index
		System.out.println("The item in index 1 is: " + cars.get(1));
		
		//here is another way to iterate
		System.out.println("Here is another way to loop through the array");
		for (int i = 0; i < size; i++) {
			System.out.println("Item on index " + i + " is: " + cars.get(i) );
		}
		
		//removing items
		//this will remove last item
		cars.remove(size -1);
		
		System.out.println("After removing: ");
		for (String car : cars) {
			System.out.println(car);
		}
		
		/**
		 * Array List - {0,1,2,3,4,5,6}
		 * Linked List - [0] > [1] > [3]
		 * 					 <     <
		 * 
		 * Array List: When you have 'add' at the end and 'remove' from the end and getting is fast
		 * Linked List: When you have 'add' at the beginning and 'remove' from the beginning
		 */				
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> lList = new LinkedList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
		
	}

	
	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("\nBeginning of the duration method for " + listType);
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementsToAdd = size + 100000;
		
		for (int i = size; i < elementsToAdd; i++) {
			list.add(i);
			list.add(0, i); //linked list is faster for this because we are adding items to beginning
		}
		
		
		long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		System.out.println("Duration of the list " + listType + " is " + duration + " ms");
	}

}