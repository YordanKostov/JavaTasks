package string;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		if (str == null || str2 == null || str.equals(" ") || str2.equals(" ")) {
			System.out.println("Invalid words");
			return;
		}
		char[] lettersOfFirst = new char[str.length()];
		char[] lettersOfSecond = new char[str2.length()];

		if (str.length() == str2.length()) {
			System.out.println("The words have the same length");
			for (int index = 0; index < lettersOfFirst.length; index++) {
				if (str.charAt(index) != str2.charAt(index)) {
					System.out.println(index + " " + str.charAt(index) + " - " + str2.charAt(index));
				}
			}

		} else {
			System.out.println("The words have a different length and cannot be compared");
		}

	}

}
