package loops;

import java.util.Scanner;

public class Zadacha19 {
	
//	�� �� ������� ��������, ���� ����� �� ��������
//	���������� ����� �� ��������� [10..99] �� ������� ��������
//	�����, ��� �������� �� �������� ����������:
//	1) ��� ����������� ����� � ����� �� ������� 0.5*�������;
//	2) ��� ����������� ����� � ������� �� ������� 3*������� +1.
//	����������� ���������� ������ �� �� ������ �������� 1.

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
