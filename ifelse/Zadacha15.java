package ifelse;

import java.util.Scanner;

public class Zadacha15 {

	public static void main(String[] args) {
		System.out.print("Vyvedete tricifreno chislo: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c = num % 10;
		int b = num / 10 % 10;
		int a = num / 100 % 10;

		if ((num >= 100) && (num <= 999) && (a != c) && (a != b) && (b != c)) {
			if ((a == b) && (b == c)) {
				System.out.println("Cifrite sa ravni");
			}
			if ((a > b) && (b > c)) {
				System.out.println("Cifrite sa v nizhodqsht red");
			}
			if ((a < b) && (b < c)) {
				System.out.println("Cifrite sa vuv vyzhodqsht red");
			}

		} else {
			System.out.println("Cifrite sa nenaredeni,za neopisanite sluchai!");
		}
	}
}