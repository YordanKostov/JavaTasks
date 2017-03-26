package loops;

import java.util.Scanner;

public class Zadacha19 {
	
//	Да се състави програма, чрез която по въведено
//	естествено число от интервала [10..99] се извежда поредица
//	числа, при спазване на следните изисквания:
//	1) ако предходното число е четно се извежда 0.5*числото;
//	2) ако предходното число е нечетно се извежда 3*числото +1.
//	Извеждането продължава докато не се получи стойност 1.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nextNumber = sc.nextInt();
		if (nextNumber >= 10 && nextNumber < 100) {
			while (nextNumber > 1) {
				if (nextNumber % 2 == 0) {
					nextNumber = nextNumber / 2;
				} else {
					nextNumber = (nextNumber * 3) + 1;
				}
				System.out.print(nextNumber + ", ");
			}
		}

	}

}
