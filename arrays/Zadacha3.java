package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int[] array = new int[10];
		for (int fill = 0; fill < array.length; fill++) {
			if (fill == 0 || fill == 1) {
				array[fill] = number;
			} else {
				array[fill] = array[fill - 1] + array[fill - 2];
			}
		}

		System.out.println(Arrays.toString(array));
	}

}
