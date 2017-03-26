package loops;
import java.util.Scanner;

public class Zadacha10 {
	
	// Въведете число от клавиатурата и определете дали е
	// просто. Просто число е това което се дели САМО на 1 и на себе
	// си.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		boolean isItSimple = true;
		
		for(int index = 2; index * index < num; index++){
			if (num % index == 0) {
				isItSimple = false;
				break;
			}
		}
		System.out.println(isItSimple ? "Its simple" : "Its not simple");
	}

}
