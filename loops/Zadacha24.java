package loops;

import java.util.Scanner;

public class Zadacha24 {

//	Да се направи програма, която по дадено число N, да изчислява
//	N!, т.е. 1*2*3*4...*N.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		long sum = 1;
		int multiplier = 1;
		do {
			sum*=multiplier;
			multiplier++;
		} while (multiplier <= number);

		System.out.println("The N! of the number is: " + sum);
	}

}
