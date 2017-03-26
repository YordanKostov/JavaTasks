package arrays2d;

public class Zadacha4 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }

		};

		int[][] newArray = new int[a[0].length][a.length];
		for (int row = 0; row < a[0].length; row++) {
			for (int col = a.length - 1; col >= 0; col--) {
				newArray[row][col] = a[col][row];
				System.out.print(", ");
				if (col == 3) {
					System.out.println(" ");
				}
				System.out.print(newArray[row][col]);
			}
		}

	}

}
