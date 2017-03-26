package loops;

import java.util.Scanner;

public class Zadacha9 {
	
//	Да се прочетат 2 числа от клавиатурата А и В.
//	Да се изведат всички числа от А до В на степен 2(разделени с
//	запетая).Ако някое число е кратно на 3, да се изведе съобщение че
//	числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
//	пропуснатите) стане по-голяма от 200, да се прекрати извеждането.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;

		if (num2 < num1) {
			int temp = 0;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + " " + num2);
		while (num1 < num2) {
			int square = num1 * num1;
			if (square % 3 != 0) {
				sum += square;
				System.out.println(square);
			} else {
				System.out.println("skip 3");
			}
			if (sum > 200) {
				System.out.println("Sumata e poveche ot 200");
				break;
			}
			num1++;
		}
	}

}
