package callGSM;

public class Demo {

	public static void main(String[] args) {

		GSM iphone = new GSM("Iphone");
		GSM samsung = new GSM("Samsung");
		
		int[] number1 = {0,8,9,5,2,5,8,3,8,2};
		int[] number2 = {0,8,9,7,2,7,5,4,3,1};
		
		iphone.insertSimCard(number1);
		samsung.insertSimCard(number2);
		
		iphone.call(samsung, 15);
		iphone.call(samsung, 50);
		
		System.out.println(iphone.getSumForCall());
	}

}
