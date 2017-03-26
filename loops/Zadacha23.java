package loops;

import java.util.Scanner;

public class Zadacha23 {
	
//	Едно число X е палиндром, aко се чете еднакво отпред назад и
//	отзад напред.
//	Да се състави програма, която проверява дали въведено число е
//	палиндром.
//	Входни данни: N - естествено число от интервала [10 .. 30000].

	public static void main(String[] args) {
		int remainder, sum = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check is palindrome");
		int number = sc.nextInt();
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (sum * 10) + remainder;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome");
		}
	}
}
