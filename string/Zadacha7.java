package string;

import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words separated by space");
		String words = sc.nextLine();

		if (words.equals(" ") || words == null || !(words.contains(" "))) {
			System.out.println("Invalid words");
			return;
		} else {
			String[] split = words.split(" ");
			int max = 0;
			for (int index = 0; index < split.length; index++) {
				if (split[index].length() > max) {
					max = split[index].length();
				}
			}
			System.out.println("There are " + split.length + " words. The longest one has " + max + " characters");
		}
	}

}
