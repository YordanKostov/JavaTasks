package loops;

import java.util.Scanner;

public class Zadacha11 {
	
//	Въведете число N чрез конзолата и изкарайте като
//	резултат следния триъгълник с височина N:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a numberF");
		int num = sc.nextInt();
		int space = 1;
		boolean isFirstLine = true;
		for (int i = 1; i <= num; i++) {
			if (!isFirstLine) {
				space += 2;
			}
			for (int k = 0; k < num - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < space; j++) {
				if ((j == 0) || (j == space - 1) || (i == num)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
			isFirstLine = false;
		}

	}

}
