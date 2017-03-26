package string;

import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to check if its a palindrome");
		String word = sc.next();
		boolean isPalindrome = false;

		if (word == null || word.equals(" ")) {
			System.out.println("Invalid word");
			return;
		} else {
			for (int index = 0; index < (word.length() / 2); ++index) {
				if (word.charAt(index) != word.charAt(word.length() - index - 1)) {
					isPalindrome = false;
				} else {
					isPalindrome = true;
				}
			}
		}
		if (isPalindrome == true) {
			System.out.println("The word is a palindrome");
		} else {
			System.out.println("The word is not a palindrome");
		}

	}
}
