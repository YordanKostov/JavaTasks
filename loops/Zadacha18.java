package loops;

import java.util.Scanner;

public class Zadacha18 {
	
//	Да се състави програма, чрез която се въвежда две числа от
//	интервала [1..9].
//	Програмата да извежда таблицата за умножение.
//	Максималната стойност на множителите е определена от 2-те
//	числа.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers between 1 and 9");
		int num = sc.nextInt();
		int secondNum = sc.nextInt();
		if (num > 0 && num < 10 && secondNum > 0 && secondNum < 10) {
			for (int start = 1; start <= num; start++) {
				for (int finish = 1; finish <= secondNum; finish++) {
					int multiply = start * finish;
					System.out.println(start + "*" + finish + "=" + multiply);
				}
			}
		}

	}

}
