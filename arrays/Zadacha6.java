package arrays;

import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array length");
		int num1 = sc.nextInt();
		System.out.println("Enter second arry length");
		int num2 = sc.nextInt();
		boolean areTheSame = false;
		int[] arr1 = new int[num1];
		int[] arr2 = new int[num2];
		System.out.println("Fill first array");
		for (int index = 0; index < arr1.length; index++) {
			arr1[index] = sc.nextInt();
		}
		System.out.println("Fill second array");
		for (int index = 0; index < arr2.length; index++) {
			arr2[index] = sc.nextInt();
		}

		if (arr1.length == arr2.length) {
			System.out.println("Same lenght");
			for (int index = 0; index < arr2.length; index++) {
				if (arr1[index] == arr2[index]) {
					areTheSame = true;
				} else {
					areTheSame = false;
					break;
				}
			}
			if (areTheSame == true) {
				System.out.println("Same numbers");
			} else {
				System.out.println("Not filled with the same numbers");
			}
		} else {
			System.out.println("Not the same lenght");
			System.out.println("Not filled with the same numbers");
		}
	}

}
