package loops;

import java.util.Scanner;

public class Zadacha15 {

	// �� �� ������� ��������, ����� �� ������� ������ ��
	// ������ ����� �� 1 �� �������� ����� N.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int sum = 0;
		int start = 0;
		do {
			sum += start;
			start++;
		} while (start <= number);

		System.out.println(sum);
	}

}
