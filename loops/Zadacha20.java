package loops;

import java.util.Scanner;

public class Zadacha20 {
	
//	Дадено е наредено тесте карти.
//	Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама,
//	Поп, Асо.
//	Наредбата по цвят на картите е: спатия, каро, купа, пика.
//	Да се създаде програма, чрез която се въвежда N - число от
//	интервала [1..51] и се извеждат въведения номер карта и
//	останалите по-големи карти от тестето.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nomer = sc.nextInt();
		String cardName = null;
		String colorName = null;

		for (int card = 2; card < 15; card++) {
			switch (card) {
			case 11:
				cardName = "Vale";
				break;
			case 12:
				cardName = "Dama";
				break;
			case 13:
				cardName = "Pop";
				break;
			case 14:
				cardName = "Aso";
			default:
				System.out.println(card);
				break;
			}
			for (int color = 0; color < 4; color++) {
				switch (color) {
				case 0:
					colorName = "Spatiq";
					break;
				case 1:
					colorName = "Karo";
					break;
				case 2:
					colorName = "Kupa";
					break;
				case 3:
					colorName = "Pika";
					break;
				default:
					System.out.println("Nqma");
					break;
				}
				System.out.println(cardName + " " + colorName);
				
			}
			

		}
	}

}
