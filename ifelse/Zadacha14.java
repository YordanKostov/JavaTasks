package ifelse;

import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {

		System.out.print("Enter hour ");
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();

		if ((hour >= 0) && (hour <= 24)) {

			if (((hour >= 18) && (hour <= 24)) || ((hour >= 0) && (hour < 4))) {
				System.out.println("Good night!");
			}
			if ((hour >= 4) && (hour < 9)) {
				System.out.println("Good morning!");
			}
			if ((hour >= 9) && (hour < 18)) {
				System.out.println("Good day!");
			}
		} else {
			System.out.println("The hour is not between 0 and 24");
		}

	}
}
