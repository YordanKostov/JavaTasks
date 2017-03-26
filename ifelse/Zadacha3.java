package ifelse;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();

		System.out.println("Before the switch " + number1 + " " + number2);

		int temp = number1;
		number1 = number2;
		number2 = temp;

		System.out.println("After the switch: " + number1 + " " + number2);
	}

}
