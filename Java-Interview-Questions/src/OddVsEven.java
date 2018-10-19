
public class OddVsEven {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
		
		OddOrEven(numbers);
		
	}

	public static void OddOrEven(int[] array) {
		for (int i : array) {
			if (i % 2 == 0) {
				System.out.println(i + " is an even number!");
			} else {
				System.out.println(i + " is an odd number!");
			}

		}
	}
}
