package ifelse;

import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = 2;
		int b = 3;
		int kofi = num / (a + b);
		int c = kofi -= 1;
		int d = kofi += 1;

		if ((num >= 10) && (num <= 9999)) {
			if (num % 5 == 0) {
				System.out.println(kofi + " puti po " + a + " litra");
				System.out.println(kofi + " puti po " + b + " litra");
			}
			if (num % 5 == 1) {
				System.out.println(c + " puti po " + a + " litra");
				System.out.println(c + " puti po " + b + " litra");
				System.out.println("dopulnitelno 2 kofi ot " + b + " litra");

			}
			if (num % 5 == 2) {
				System.out.println(kofi + " puti po " + a + " litra");
				System.out.println(kofi + " puti po " + b + " litra");
				System.out.println("dopulnitelna kofa ot " + a + " litra");
			}
			if (num % 5 == 3) {
				System.out.println(kofi + " puti po " + a + " litra");
				System.out.println(kofi + " puti po " + b + " litra");
				System.out.println("dopulnitelna kofa ot " + b + " litra");

			}
			if (num % 5 == 4) {
				System.out.println(d + " puti po " + a + " litra");
				System.out.println(d + " puti po " + b + " litra");
				System.out.println("dopulnitelno 2 kofi ot " + a + " litra");
			}
		}

	}
}
