package string;

import java.util.Scanner;

public class Zadacha11 {

	static void printArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentance");
		String sent = sc.nextLine();
		System.out.println(sent);
	}

	public static void main(String[] args) {
		printArray();
	}

}
