package loops;

import java.util.Scanner;

public class Zadacha21 {
	
//	�� �� ������� ��������, ����� ������� ������� 10 ���-�����
//	�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
//	�������� ���������� �����.
//	������� �� ��������, ������ � ������ ������� �����.
//	������ �����: ����� �� ��������� [1..999]

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
