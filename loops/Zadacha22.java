package loops;

public class Zadacha22 {
	
//	�� �� ������� ��������, ����� ���� ����� while �������
//	��������� �� ���������, �� ��� ����������.
//	�.�. ��� � �������� 4*5 �� �� ������� 5*4.

	public static void main(String[] args) {
		int number = 1;
		int multiplier = 1;
		while (number < 10) {
			while (multiplier < 9) {
				System.out.print(number + "*" + multiplier + "; ");
				multiplier++; 
			}
			System.out.print(number + "*" + multiplier + "; ");
			multiplier =1 + number; 
			number++;
			System.out.println();
		}
	}

}
