package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float[] num = new float[10];
		float[] num2 = new float[num.length];
		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextFloat();
		}
		for (int index = 0; index < num.length; index++) {
			if (num[index] < -0.231f) {

				num2[index] = ((index + 1) * (index + 1)) + 41.25f;
			} else {
				num2[index] = num[index] * (index + 1);
			}
		}
		System.out.println(Arrays.toString(num2));

	}

}
