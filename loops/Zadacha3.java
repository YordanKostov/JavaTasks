package loops;

public class Zadacha3 {

//	ƒа се изведат на екрана всички нечетни числа от -10
//	до 10
	
	public static void main(String[] args) {

		for (int number = -10; number <= 10; number++) {
			if (number % 2 == -1 || number % 2 == 1) {
				System.out.println(number);
			}
		}
	}

}
