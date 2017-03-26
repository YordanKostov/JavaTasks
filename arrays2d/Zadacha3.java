package arrays2d;

public class Zadacha3 {

	public static void main(String[] args) {
		int[][] a = { { 1, 4, 6, 3 }, { 5, 9, 7, 2 }, { 4, 8, 1, 9 }, { 2, 3, 4, 5 } };
		int sum = 0;
		int count = 0;
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				sum += a[row][col];
				count++;
			}
		}
		float average = sum / count;
		System.out.println("The sum is: " + sum);
		System.out.println("Average: " + average);
	}

}
