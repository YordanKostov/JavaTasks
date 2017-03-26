package string;

import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		String sent2 = sc.nextLine();

		if (sent == null || sent2 == null || sent.equals(" ") || sent2.equals(" ")) {
			System.out.println("Invalid words");
			return;
		}

		if (sent.length() < 40 && sent2.length() < 40) {
			System.out.println(sent.toUpperCase() + ", " + sent.toLowerCase());
			System.out.println(sent2.toUpperCase() + ", " + sent2.toLowerCase());
		}

	}
}
