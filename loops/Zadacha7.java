package loops;

import java.util.Scanner;

public class Zadacha7 {
	
//	Започвайки от 3, да се изведат на екрана първите n
//	числа които се делят на 3. Числата да са разделени със запетая.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int threes = 3;
		
		for (int index = 1; index <= number; index++) {
			System.out.print(threes + ", ");
			threes += 3;
		}
	}

}
