package loops;

import java.util.Scanner;

public class Zadacha5 {
	
//	�� �� ������� �� ����������� 2 �����. � �� ��
//	������� �� ������ ������ ����� �� ��-������� �� ��-��������.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		if (number1 < number2) {
			for (int num = number1; num <= number2; num++) {
				System.out.println(num);
			}
		}else {
			for (int num = number2; num <= number1; num++) {
				System.err.println(num);
			}
		}
	}

}
