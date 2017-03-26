package loops;

import java.util.Scanner;

public class Zadacha8 {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int start = number - 1;
		for (int row = 0; row < number; row++) {
			for (int col = 0; col < number; col++) {
				System.out.print(start);
			}
			System.out.println();
			start = start + 2;
		}
	}

}
