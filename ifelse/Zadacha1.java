package ifelse;

import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		double number1 = sc.nextDouble();
		double number2 = sc.nextDouble();

		System.out.println("Enter a third number to compare: ");
		double number3 = sc.nextDouble();

		if ((number1 > number3 && number2 < number3) || (number1 < number3 && number2 > number3)) {
			System.out.println("The number " + number3 + " is between the numbers " + number1 + " and " + number2);

		} else {
			System.out.println("The number " + number3 + " is not between the numbers " + number1 + " and " + number2);
		}
	}

}
