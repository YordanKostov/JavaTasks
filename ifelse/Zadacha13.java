package ifelse;

import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if ((a >= 1) && (a <= 8) && (b >= 1) && (b <= 8) && (c >= 1) && (c <= 8) && (d <= 8) && (d >= 1)) {
			if (((a % 2 == 1) && (b % 2 == 1) && (c % 2 == 1) && (d % 2 == 1))
					|| ((a % 2 == 0) && (b % 2 == 1) && (c % 2 == 0) && (d % 2 == 1))
					|| ((a % 2 == 1) && (b % 2 == 0) && (c % 2 == 1) && (d % 2 == 0))
					|| ((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0) && (d % 2 == 0))
					|| ((a % 2 == 1) && (b % 2 == 1) && (c % 2 == 0) && (d % 2 == 0))) {
				System.out.println("Same colored postions");
			}
			if (((a % 2 == 0) && (b % 2 == 0) && (c % 2 == 1) && (d % 2 == 1))
					|| ((a % 2 == 1) && (b % 2 == 1) && (c % 2 == 1) && (d % 2 == 0))) {
				System.out.println("Different colored positions");
			}
		} else {
			System.out.println("Invalid position");
		}

	}

}
