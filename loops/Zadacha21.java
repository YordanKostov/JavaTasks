package loops;

import java.util.Scanner;

public class Zadacha21 {
	
//	Да се състави програма, която извежда първите 10 най-малки
//	числа, които се делят на 2, 3 или на 5 и които са по-големи от
//	въведено естествено число.
//	Числата се извеждат, заедно с техния пореден номер.
//	Входни данни: число от интервала [1..999]

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int pos = 1;
		while (pos < 11) {
			if ((number % 2 == 0) || (number % 3 == 0) || (number % 5 == 0)) {
				System.out.println(pos + ":" + number);
				pos++;
			}
			number++;
		}

	}

}
