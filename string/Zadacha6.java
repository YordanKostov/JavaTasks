package string;

import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words separated by space");
		String words = sc.nextLine();
		String[] splitWords = words.split(" ");

		if (words.equals("") || words == null || !(words.contains(" "))) {
			System.out.println("The entered words are invalid");
			return;
		}
		for (int index = 0; index < splitWords.length; index++) {
			char first = Character.toUpperCase(splitWords[index].charAt(0));
			String others = splitWords[index].substring(1).toLowerCase();
			String betterIdea = first + others;
			System.out.print(betterIdea + " ");

		}
	}

}
