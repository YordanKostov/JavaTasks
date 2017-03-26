package arrays;

public class Zadacha1 {

	public static void main(String[] args) {
		int[] array = { 10, 15, 7, 9, -9, -15 };
		int min = 100;
		for (int num = 0; num < array.length; num++) {
			if (array[num] < min) {
				min = array[num];
			}
		}

		System.out.println(min);
	}

}
