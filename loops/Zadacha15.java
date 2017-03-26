package loops;

import java.util.Scanner;

public class Zadacha15 {

	// Да се състави програма, която да изчисли сумата на
	// всички числа от 1 до въведено число N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		int start = 0;
		do {
			sum += start;
			start++;
		} while (start <= number);

		System.out.println(sum);
	}

}
