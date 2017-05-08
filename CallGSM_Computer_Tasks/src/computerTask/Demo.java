package computerTask;
public class Demo {

	public static void main(String[] args) {
		Computer apple = new Computer(2015,1000,true,500,450,"Mac");
		Computer asus = new Computer(2012,700,false,600,300,"Windows");
		
		apple.useMemory(150);
		asus.changeOperationSystem("Linux");
		
		apple.displayInfo();
		asus.displayInfo();
	}

}
