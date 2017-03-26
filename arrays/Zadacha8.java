package arrays;

import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		int max = 0;
		int counter = 1;
		int maxCounter = 0;
		int[] array = { 5, 7, 56, 7, 7, 7, 9, 9, 9, 9, 2, 3, 7, 5 };

		for (int index = 0; index < array.length - 1; index++) {
			if (array[index] == array[index + 1]) {
				counter += 1;
				if (counter > maxCounter) {
					maxCounter = counter;
					max = array[index];
				}
			} else {
				counter = 1;
			}
		}
		System.out.println(max + ", " + maxCounter + " puti");
	}

}
