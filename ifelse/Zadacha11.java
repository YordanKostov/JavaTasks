package ifelse;

import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		System.out.print("Vavedete tricifreno chislo koeto ne sudurja 0: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = (num / 100) % 10;
		int b = (num / 10) % 10;
		int c = num % 10;

		if ((num > 100) && (num <= 999) && (a != 0) && (b != 0) && (c != 0)) {
			if ((num % a == 0) && (num % b == 0) && (num % c == 0)) {
				System.out.println("Chisloto se deli na vsqka svoq cifra");
			} else {
				System.out.println("Chisloto ne se deli na vsqka svoq cifra");
			}
		} else {
			System.out.println("Chisloto sudurja 0");
		}

	}

}
