package loops;

import java.util.Scanner;

public class Zadacha20 {
	
//	������ � �������� ����� �����.
//	��������� �� ������ �� ����� �: 2,3,4,5,6,7,8,9,10, ����, ����,
//	���, ���.
//	��������� �� ���� �� ������� �: ������, ����, ����, ����.
//	�� �� ������� ��������, ���� ����� �� ������� N - ����� ��
//	��������� [1..51] � �� �������� ��������� ����� ����� �
//	���������� ��-������ ����� �� �������.

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
