package loops;

import java.util.Scanner;

public class Zadacha7 {
	
//	���������� �� 3, �� �� ������� �� ������ ������� n
//	����� ����� �� ����� �� 3. ������� �� �� ��������� ��� �������.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int threes = 3;
		
		for (int index = 1; index <= number; index++) {
			System.out.print(threes + ", ");
			threes += 3;
		}
	}

}
