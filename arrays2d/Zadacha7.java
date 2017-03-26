package arrays2d;

public class Zadacha7 {

	public static void main(String[] args) {
		int[][] a = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sumOfEvenIndexes = 0;
		int sumTotal = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				if ((col + row) % 2 == 0) {
					System.out.print(a[row][col] + ", ");
					sumOfEvenIndexes += a[row][col];
				}
			}
			sumTotal += sumOfEvenIndexes;
			System.out.println("Sum of row: " + sumOfEvenIndexes);
			sumOfEvenIndexes = 0;
		}
		System.out.println("Whole sum: " + sumTotal);
	}

}