package loops;

import java.util.Scanner;

public class Zadacha16 {
	
//	�� �� ������� ��������, ���� ����� �� �������� 2 ����������
//	����� N, M �� ��������� [10..5555].
//	����������, ���� ����� for, �� ������� ������ ����� ��
//	���������, ����� �� ������ �� 50 � �������� ���.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int secondNumber = sc.nextInt();
		if (number > secondNumber) {
			int temp = 0;
			temp = number;
			number = secondNumber;
			secondNumber = temp;
		}
		
		if ((number >= 10) && (number <= 5555) && (secondNumber >= 10) && (secondNumber <= 5555)) {
			for (int start = secondNumber; start >= number; start--) {
				if (start % 50 == 0) {
					System.out.println(start);
				}
			}
		}else {
			System.out.println("Nevalidno chislo");
		}

	}

}
