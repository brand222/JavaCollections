
public class Palindrome {

	public static void main(String[] args) {

		System.out.println(isPalindrome("Brandon"));
		System.out.println(isPalindrome("raCECar"));
		System.out.println(isPalindrome("KAYak"));
	}

	// here we have a function that takes a string as an argument
	// it reverses the string
	// and returns the string back
	public static String reverseString(String value) {
		String result = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			result += value.charAt(i);
		}
		return result.toLowerCase();
	}
	//here is a boolean function that returns true if
	//if the word equals the reversed word
	//and false if it does not equal the reversed word
	//NOTE: We are calling the reverseString function here
	public static boolean isPalindrome(String word) {
		String reversedWord = reverseString(word);
		if (word.toLowerCase().equals(reversedWord)) {
			return true;
		} else {
			return false;
		}
	}
}
