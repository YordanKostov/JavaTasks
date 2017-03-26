package ifelse;

import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two different numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		if (number1 != number2) {
			if (number1 > number2) {
				System.out.println(number2 + " " + number1);
			} else {
				System.out.println(number1 + " " + number2);
			}

		}

	}
}