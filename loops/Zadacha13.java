package loops;

import java.util.Scanner;

public class Zadacha13 {
	
//	Да се състави програма, която извежда всички
//	естествени трицифрени числа, които имат сбор на цифрите равен
//	на дадено число.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 2 and 27");
		
		int num = sc.nextInt();
		if (num > 2 && num < 27) {
			for (int index = 100; index < 1000; index++) {
				int hund = (index / 100) % 10;
				int tens = (index / 10) % 10;
				int ones = index % 10;
				if ((hund + tens + ones) == num) {
					System.out.println(index);
				}
			}
		}
		

	}

}
