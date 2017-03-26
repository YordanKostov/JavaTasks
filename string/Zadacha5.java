package string;

import java.util.Scanner;

public class Zadacha5 {

	private static final int FIRST_CHARACTER = 0;
	private static final int SECOND_WORD = 1;
	private static final int FIRST_WORD = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words separated by space");
		String words = sc.nextLine();

		if (words == null || words.equals("") || !(words.contains(" "))) {
			System.out.println("Invalid words");
		}

		String[] split = words.split(" ");
		char[] firstWord = split[FIRST_WORD].toCharArray();

		if (split[FIRST_WORD].indexOf(split[SECOND_WORD].charAt(FIRST_CHARACTER)) >= 0) {
			for (int index = 0; index < firstWord.length; index++) {
				if (firstWord[index] == (split[SECOND_WORD].charAt(FIRST_CHARACTER))) {
					System.out.println(split[SECOND_WORD]);
				} else {
					System.out.println(firstWord[index]);
				}
			}
		} else {
			System.out.println("There isnt a matching letter");
		}
	}

}
