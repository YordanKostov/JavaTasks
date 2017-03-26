package arrays;

import java.util.Arrays;

public class Zadacha2 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 23, 7, 5, 7, 9 };
		int[] arr2 = new int[6];
		int count = 1;
		for (int index = 0; index < arr2.length; index++) {
			if (index < arr1.length / 2) {
				arr2[index] = arr1[index];
			} else {
				arr2[index] = arr1[index - count];
				count += 2;
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
