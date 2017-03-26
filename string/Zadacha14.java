package string;

public class Zadacha14 {
	static long calcNFact(int num) {
		long factoriel = 1;
		for (int index = 0; index < num; index++) {
			factoriel *= index + 1;
		}
		return factoriel;
	}

	public static void main(String[] args) {
		System.out.println(calcNFact(6));
	}

}
