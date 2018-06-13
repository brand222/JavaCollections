package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {
		
		//here we create our hashset
		//NOTE: we are unable to add duplicate values to Sets
		//hash sets DO NOT maintain any order - which make it faster
		Set<String> set = new HashSet<String>();
		set.add("Brandon");
		set.add("Chris");
		set.add("Michelle");
		set.add("Brad");
		set.add("Madeline");
		
		System.out.println(set);
		
		for (String item : set) {
			System.out.println(item);
		}
		
		// LinkedHashSet - it maintains the order in which the elements are added
		Set<String> lHSet = new LinkedHashSet<String>();
		lHSet.add("Brandon");
		lHSet.add("Chris");
		lHSet.add("Michelle");
		lHSet.add("Brad");
		lHSet.add("Madeline");
		System.out.println("LinkedHashSet -------------------------------");
		for (String item : lHSet) {
			System.out.println(item);
		}
		//TreeSet - It maintains the natural sorting order (ex. 1, 2, 3 alphabetical)
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("Brandon");
		treeSet.add("Chris");
		treeSet.add("Michelle");
		treeSet.add("Brad");
		treeSet.add("Madeline");
		System.out.println("TreeSet -------------------------------------");
		for (String item : treeSet) {
			System.out.println(item);
		}
		
		//NOTICE: When you run this list, you are able to add duplicated elements no problem
		List<String> list = new ArrayList<String>();
		list.add("Brandon");
		list.add("Chris");
		list.add("Michelle");
		list.add("Brad");
		list.add("Madeline");
		//here we are adding a duplicated value
		list.add("Madeline");
		System.out.println(list);
		
	}
}
