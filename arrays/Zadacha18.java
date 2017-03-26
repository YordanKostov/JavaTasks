package arrays;

import java.util.Arrays;

public class Zadacha18 {

	public static void main(String[] args) {
		int[] arr = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] arr2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] arr3 = new int[arr.length];

		if (arr.length == arr2.length) {
			for (int index = 0; index < arr2.length; index++) {
				if (arr[index] > arr2[index]) {
					arr3[index] = arr[index];
				} else {
					arr3[index] = arr2[index];
				}
			}
		} else {
			System.out.println("The arrays have different length");
		}
		System.out.println(Arrays.toString(arr3));
	}

}
