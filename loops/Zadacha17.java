package loops;

import java.util.Scanner;

public class Zadacha17 {

	// Да се състави програма, която извежда квадрат, чийто страни са
	// оформени със знака *, а вътрешността е запълнена със въведен
	// знак.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 3 to 20 and symbol");
		int number = sc.nextInt();
		String symbol = sc.next();

		if (number > 2 && number < 21) {
			for (int row = 0; row < number; row++) {
				for (int col = 0; col < number; col++) {
					if (col == 0 || col == (number - 1) || row == 0 || row == (number - 1)) {
						System.out.print("*");
					} else {
						System.out.print(symbol);
					}
				}
				System.out.println();
			}
		}
	}

}
