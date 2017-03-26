package string;

import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();

		char[] split = word.toCharArray();
		for (int index = 0; index < split.length; index++) {
			split[index] += 5;
			System.out.print(split[index]);
		}

	}

}
