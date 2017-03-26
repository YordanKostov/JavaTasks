package arrays;

import java.util.Arrays;

public class Zadacha15 {

	public static void main(String[] args) {
		double[] arr = { 0, -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		double[] arr2 = new double[3];

		System.out.println(Arrays.toString(arr));

		for (int index = 0; index < arr.length; index++) {
			boolean hasSwap = false;
			for (int second = 0; second < arr.length - 1 - index; second++) {
				if (arr[second] > arr[second + 1]) {
					double temp = arr[second];
					arr[second] = arr[second + 1];
					arr[second + 1] = temp;
					hasSwap = true;
				}
				if (hasSwap = false) {
					break;
				}
			}
		}
		for (int index = 0; index < arr2.length; index++) {
			arr2[index] = arr[index - 3 + arr.length];
		}
		System.out.println(Arrays.toString(arr2));
	}

}
