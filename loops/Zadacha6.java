package loops;

import java.util.Scanner;

public class Zadacha6 {
	
//	�� �� ������� ����� �� ������(���������) � �� ��
//	������ ����� �� ������ ����� ����� 1 � ���������� �����.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int sum = 0;
		
		for (int index = 1; index <= number; index++) {
			sum += index;
		}
		System.out.println(sum);
	}

}
