package arrays;

import java.util.Arrays;

public class Zadacha5 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int index = 0; index < arr.length; index++) {
			arr[index] = index * 3;
		}
		System.out.println(Arrays.toString(arr));
	}

}
