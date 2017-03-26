package ifelse;

import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4 digit number: ");
		int number = sc.nextInt();

		int thousands = (number / 1000) % 10;
		int hundreds = (number / 100) % 10;
		int tens = (number / 10) % 10;
		int ones = number % 10;

		if (number > 1000 && number < 9999) {
			if (thousands > hundreds) {
				System.out.println("The number " + thousands + "" + ones + " is greater than " + hundreds + "" + tens);
			}
			if (hundreds > thousands) {
				System.out.println("The number " + thousands + "" + ones + " is less than " + hundreds + "" + tens);
			}
			if (hundreds == thousands) {
				if (ones > tens) {
					System.out.println(
							"The number " + thousands + "" + ones + " is greater than " + hundreds + "" + tens);
				}
				if (tens > ones) {
					System.out.println("The number " + thousands + "" + ones + " is less than " + hundreds + "" + tens);
				}
				if (tens == ones) {
					System.out.println("The number " + thousands + "" + ones + " is equal to " + hundreds + "" + tens);
				}
			}
		} else {
			System.out.println("The number doesnt have 4 digits");
		}
	}

}
