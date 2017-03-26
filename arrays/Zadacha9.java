package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		System.out.println("Enter 6 numbers to fill the array");

		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		for (int index = 0; index < arr.length / 2; index++) {
			int temp = arr[index];
			arr[index] = arr[arr.length - index - 1];
			arr[arr.length - index - 1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
