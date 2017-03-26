package arrays;

import java.util.Arrays;

public class Zadacha7 {

	public static void main(String[] args) {
		int[] arr1 = { 1, 8, 3, 9, 1, 8, 13 };
		int[] arr2 = new int[arr1.length];

		for (int index = 0; index < arr2.length; index++) {
			if (index == 0 || index == (arr2.length - 1)) {
				arr2[index] = arr1[index];
			} else {
				arr2[index] = arr1[index - 1] + arr1[index + 1];
			}
		}

		System.out.println(Arrays.toString(arr2));
	}

}
