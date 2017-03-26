package string;

import java.util.Arrays;

public class Zadacha13 {
	static int[] returnArray(int[] arr1, int[] arr2) {
		int secondPart = arr1.length;
		int[] newArr = new int[arr1.length + arr2.length];
		for (int index = 0; index < newArr.length; index++) {
			if (index < arr1.length) {
				newArr[index] = arr1[index];
			}
			if (index >= arr1.length) {
				newArr[secondPart] = arr2[index - arr1.length];
				secondPart++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 7, 3, 9, 4 };
		int[] arr2 = { 2, 1, 8, 5 };
		System.out.println(Arrays.toString(returnArray(arr1, arr2)));
	}

}
