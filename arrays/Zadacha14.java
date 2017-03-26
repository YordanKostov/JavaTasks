package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float[] arr = new float[6];
		System.out.println("Enter numbers");

		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextFloat();
			if (arr[index] > -2.99 && arr[index] < 2.99) {
				count++;
			}
		}
		float[] arr2 = new float[count];
		int var = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > -2.99 && arr[index] < 2.99) {
				arr2[var] = arr[index];
				var++;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
