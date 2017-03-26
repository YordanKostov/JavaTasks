package ifelse;

import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour of the day");
		int hour = sc.nextInt();
		System.out.println("Enter sum of money");
		double money = sc.nextDouble();
		System.out.println("Enter true for healthy and false for unhealthy");
		boolean isHealthy = sc.nextBoolean();

		if (isHealthy = false) {
			System.out.println("I wont go out");
			if (money > 0) {
				System.out.println("Ill buy meds");
			}
			if (money == 0) {
				System.out.println("Ill stay home and drink tea");
			}
		}

		if (isHealthy = true) {
			if (money >= 10) {
				System.out.println("Ill go to the cinema");
			} else {
				System.out.println("Ill grab a cup of coffee with friends");
			}
		}

	}

}
