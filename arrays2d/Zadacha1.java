package arrays2d;

public class Zadacha1 {

	public static void main(String[] args) {
		int[][] a = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 }, { 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 } };
		int max = 0;
		int min = 100;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length - 1; col++) {
				if (a[row][col] > max) {
					max = a[row][col];
				}
				if (a[row][col] < min) {
					min = a[row][col];
				}
			}
		}

		System.out.println("The highest number is: " + max);
		System.out.println("The lowest number is: " + min);
	}

}
