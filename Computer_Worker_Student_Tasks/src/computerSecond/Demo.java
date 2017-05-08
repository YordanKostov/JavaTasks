package computerSecond;

public class Demo {

	public static void main(String[] args) {

		Computer lenovo = new Computer(1999, 200, 500, 300);
		Computer mac = new Computer(2005, 600, false, 500,700, "Mac");
		
		switch (mac.comparePrice(lenovo)) {
		case -1:
			System.out.println("The first computer is more expensive");
			break;
		case 0:
			System.out.println("Both computers have the same price");
	        break;
		case 1:
			System.out.println("The second computer is more expensive");
			break;
		default:
			break;
		}
	}

}
