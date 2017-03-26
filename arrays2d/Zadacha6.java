package arrays2d;

public class Zadacha6 {

	public static void main(String[] args) {

		int[][] a = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int sumOfRow = 0;
		int sumOfEvenRows = 0;
		for (int row = 1; row < a.length; row += 2) {
			for (int col = 0; col < a.length; col++) {
				System.out.print(a[row][col] + ", ");
				sumOfRow += a[row][col];
			}
			sumOfEvenRows += sumOfRow;
			System.out.println("Sum of row: " + sumOfRow);
			sumOfRow = 0;

		}
		System.out.println("Sum of even rows: " + sumOfEvenRows);
	}

}
