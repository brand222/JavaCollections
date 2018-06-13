import java.util.ArrayList;
import java.util.List;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array2 = { 2, 4, 6, 8, 10, 12 };
		// now reverse both these array and print out the items in them to
		// verify it worked
		reverseArray(array1);
		for (int items : array1) {
			System.out.println(items);
		}
		System.out.println("array1 AFTER reversing array ------------");
		reverseArray(array2);
		for (int items : array2) {
			System.out.println(items);
		}
		System.out.println("array2 AFTER reversing array ------------");
	}
	
	public static int[] reverseArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}
