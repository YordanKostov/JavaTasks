package arrays2d;

public class Zadacha5 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int sumOfRows = 0;
		int sumOfCols = 0;
		int maxSumOfRows = 0;
		int maxSumOfCols = 0;

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				sumOfRows += a[row][col];
				if (sumOfRows > maxSumOfRows) {
					maxSumOfRows = sumOfRows;
				}

				sumOfCols += a[col][row];
				if (sumOfCols > maxSumOfCols) {
					maxSumOfCols = sumOfCols;
				}
			}
			sumOfRows = 0;
			sumOfCols = 0;
		}
		System.out.println("Max sum of rows: " + maxSumOfRows);
		System.out.println("Max sum of cols: " + maxSumOfCols);

		if (maxSumOfCols > maxSumOfRows) {
			System.out.println("The max sum of cols is greater than the sum of rows");
		} else {
			System.out.println("The max sum of rows is greater than the sum or cols");
		}
	}

}
