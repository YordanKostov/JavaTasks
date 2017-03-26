package arrays2d;

import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {

		int[][] a = new int[4][4];
		Scanner sc = new Scanner(System.in);

		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a.length; col++) {
				System.out.print("Fill the 2D Array [" + row + "][" + col + "]");
				a[row][col] = sc.nextInt();
			}
		}

		for (int row = 0, col = 0; row < a.length && col < a.length; row++, col++) {
			System.out.print(a[row][col] + " ");
		}
		System.out.println();
		for (int row = 0, col = 3; row <= a.length && col >= 0; row++, col--) {
			System.out.print(a[row][col] + " ");
		}
	}

}
