package arrays;

public class Zadacha10 {

	// �� �� ������� ��������, ���� ����� �� �������� 7 ���� ����� �
	// ��������� �����.
	// ���������� �� ������ �������, ����� � ���-������ �� ��������
	// �������� �� ���������� �����.

	public static void main(String[] args) {
		int[] array = { 1, 7, 3, 8, 11, 6, 7, 50, 17 };
		int average = 0;
		int sum = 0;
		int razlika = 0;
		int closest = 1000;
		int min = 2000;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}

		average = sum / array.length;

		for (int index = 0; index < array.length; index++) {
			razlika = array[index] - average;
			if (razlika < 0) {
				razlika *= -1;
			}
			if (razlika < closest) {
				closest = razlika;
				min = array[index];
			}
		}

		System.out.println("Average: " + average + ", closest: " + min);
	}

}
