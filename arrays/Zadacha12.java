package arrays;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Zadacha12 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int index = 0; index < arr.length; index++) {
			if (index == 0) {
				int temp = 0;
				temp = arr[index];
				arr[index] = arr[index + 1];
				arr[index + 1] = temp;
			}
			if (index == 2) {
				arr[index] = arr[index] ^ arr[index + 1];
				arr[index + 1] = arr[index] ^ arr[index + 1];
				arr[index] = arr[index] ^ arr[index + 1];
			}
			if (index == 4) {
				arr[index] = arr[index] + arr[index + 1];
				arr[index + 1] = arr[index] - arr[index + 1];
				arr[index] = arr[index] - arr[index + 1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
