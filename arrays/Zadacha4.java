package arrays;

import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length");
		int num = sc.nextInt();
		int[] arr = new int[num];
		boolean isPalindrome = false;
		System.out.println("Fill array");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}

		for (int index = 0; index < arr.length / 2; index++) {
			if (arr[index] == arr[arr.length - index - 1]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				System.out.println("The array is not palindrome");
				break;
			}
		}
		if (isPalindrome == true) {
			System.out.println("The array is palindrome");
		}
	}

}
