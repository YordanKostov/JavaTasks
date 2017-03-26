package arrays;

public class Zadacha17 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 3, 7 };
		boolean isZig = false;
		for (int index = 1; index < arr.length - 1; index++) {
			if (index % 2 == 1) {
				if (arr[index - 1] < arr[index] && arr[index] > arr[index + 1]) {
					isZig = true;
					continue;
				} else {
					isZig = false;
					break;
				}
			}
		}
		if (isZig == true) {
			System.out.println("Its zig");
		} else {
			System.out.println("Its not zig");
		}
	}
}
