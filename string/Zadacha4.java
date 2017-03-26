package string;

import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two names separated by a comma");
		String names = sc.nextLine();
		if (!(names == null || names.equals("") || !(names.contains(",")))) {

			String[] splitNames = names.split(",");
			int lengthOfFirst = 0;
			int lengthOfSecond = 0;
			char[] letters = splitNames[0].toCharArray();
			char[] letters2 = splitNames[1].toCharArray();

			for (int index = 0; index < letters.length; index++) {
				lengthOfFirst += (int) letters[index];
			}
			for (int index = 0; index < letters2.length; index++) {
				lengthOfSecond += (int) letters2[index];
			}

			if (lengthOfFirst > lengthOfSecond) {
				System.out.println("The first name has a longer ASCII length");
			}
			if (lengthOfFirst < lengthOfSecond) {
				System.out.println("The second name has a longer ASCII length");
			}
			if (lengthOfFirst == lengthOfSecond) {
				System.out.println("Both names have the same length");
			}
		} else {
			System.out.println("Invalid names");
		}

	}
}
