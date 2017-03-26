package loops;

public class Zadacha22 {
	
//	Да се състави програма, която чрез цикъл while извежда
//	таблицата за умножение, но без повторение.
//	Т.е. ако е изведено 4*5 не се извежда 5*4.

	public static void main(String[] args) {
		int number = 1;
		int multiplier = 1;
		while (number < 10) {
			while (multiplier < 9) {
				System.out.print(number + "*" + multiplier + "; ");
				multiplier++; 
			}
			System.out.print(number + "*" + multiplier + "; ");
			multiplier =1 + number; 
			number++;
			System.out.println();
		}
	}

}
