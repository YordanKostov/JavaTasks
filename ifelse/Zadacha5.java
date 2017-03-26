package ifelse;

import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		if ((number1 != number2) && (number1 != number3) && (number2 != number3)) {
			if ((number1 > number2) && (number2 > number3)) {
				System.out.println(number1 + " " + number2 + " " + number3);
			}
			if ((number1 > number3) && (number2 < number3)) {
				System.out.println(number1 + " " + number3 + " " + number2);
			}
			if ((number2 > number3) && (number3 > number1)) {
				System.out.println(number2 + " " + number3 + " " + number1);
			}
			if ((number2 > number1) && (number1 > number3)) {
				System.out.println(number2 + " " + number1 + " " + number3);
			}
			if ((number3 > number2) && (number2 > number1)) {
				System.out.println(number3 + " " + number2 + " " + number1);
			}
			if ((number3 > number1) && (number1 > number2)) {
				System.out.println(number3 + " " + number1 + " " + number2);
			}
		}

	}

}
