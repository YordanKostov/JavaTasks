package loops;

import java.util.Scanner;

public class Zadacha14 {
	
//	�� �� ������� ��������, ����� �� ��������
//	���������� ����� N �� ��������� [10..200] ������� � �������
//	��� ������ �����, ����� �� ������ �� 7 � �� ��-����� �� N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 200");
		int num = sc.nextInt();
		if (num > 10 && num < 200) {
			for (int index = 200; index > 10; index--) {
				if ((index < num) && (index % 7 == 0)) {
					System.out.println(index);
				}
			}
		}

	}

}
