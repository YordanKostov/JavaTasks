package string;

import java.util.Arrays;

public class Zadacha12 {
	static int[] returnArray(int num) {
		int[] arr = new int[num];
		for (int index = 0; index < arr.length; index++) {
			arr[index] = index+1;
		}
		return arr;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(returnArray(5)));
	}

}
