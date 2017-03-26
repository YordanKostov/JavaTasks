package ifelse;

import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three different numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		int temp = number1;
		number1 = number2;
		number2 = number3;
		number3 = temp;

		System.out.println("After the switch: " + number1 + " " + number2 + " " + number3);
	}

}
