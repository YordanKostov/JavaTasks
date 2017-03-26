package ifelse;

import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {

		System.out.print("Enter temperature: ");
		Scanner sc = new Scanner(System.in);

		int temp = sc.nextInt();

		if ((temp >= -100) && (temp <= 100)) {
			if (temp < -20) {
				System.out.println("Ice cold.");
			}
			if ((temp < 0) && (temp >= -20)) {
				System.out.println("Cold");
			}
			if ((temp >= 0) && (temp < 15)) {
				System.out.println("Chilly.");
			}
			if ((temp >= 15) && (temp < 25)) {
				System.out.println("Warm");
			}
			if (temp >= 25) {
				System.out.println("Hot");
			}
		} else {
			System.out.println("ERROR!");
		}

	}
}
