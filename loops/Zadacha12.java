package loops;

public class Zadacha12 {

	// Да се състави програма, която извежда всички
	// естествени трицифрени числа, които нямат еднакви цифри т.е.
	// 100,101, 606 и т.н. не се извеждат.

	public static void main(String[] args) {

		for (int num = 123; num < 987; num++) {
			int hund = (num / 100) % 10;
			int tens = (num / 10) % 10;
			int ones = num % 10;
			if ((hund == tens) || (tens == ones) || (hund == ones)) {

			} else {
				System.out.println(num);
			}

		}

	}
}
