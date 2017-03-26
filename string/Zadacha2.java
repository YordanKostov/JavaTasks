package string;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		char[] letter = new char[5];

		if (str == null || str2 == null || str.equals(" ") || str2.equals(" ")) {
			System.out.println("Invalid words");
			return;
		}

		if (str.length() > str2.length()) {
			System.out.println("The longer word is: " + str.length());
			for (int index = 0; index < 5; index++) {
				letter[index] = str2.charAt(index);
			}
			String firstPart = new String(letter);
			System.out.println(firstPart + str.substring(5));
		} else {
			System.out.println("The longer word is: " + str2.length());
			for (int index = 0; index < 5; index++) {
				letter[index] = str.charAt(index);
			}
			String firstPart = new String(letter);
			System.out.println(firstPart + str2.substring(5));
		}
	}

}
