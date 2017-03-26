package ifelse;

import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two 2 digit numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		int multipliedNumber = number1 * number2;

		int multipliedNumberOnes = multipliedNumber % 10;

		if ((number1 > 10 && number1 <= 99) && (number2 > 10 && number2 <= 99)) {
			System.out.print(multipliedNumber + ", the number is " + multipliedNumberOnes);
			if (multipliedNumberOnes % 2 == 1) {
				System.out.println(" and its odd");
			} else {
				System.out.println(" and its even");
			}
		} else {
			System.out.println("Invalid numbers");
		}

	}

}
