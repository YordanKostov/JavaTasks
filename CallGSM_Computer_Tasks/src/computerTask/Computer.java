package computerTask;

public class Computer {

	private int year;
	private float price;
	private boolean isNotebook;
	private int hardDiskMemory;
	private int freeMemory;
	private String operationSystem;

	Computer(int year, float price, boolean isNotebook, int hardDiskMemory, int freeMemory, String operationSystem) {
		if (year < 1950 || year > 2016) {
			System.out.println("Invalid year");
			this.year = 2010;
		} else {
			this.year = year;
		}

		if (price < 0) {
			System.out.println("The sum is negative");
			price = 20;
		} else {
			this.price = price;
		}

		if (hardDiskMemory < 0) {
			System.out.println("The hard disk memory is invalid");
			hardDiskMemory = 100;
		} else {
			this.hardDiskMemory = hardDiskMemory;
		}

		if (freeMemory < 0) {
			System.out.println("Free memory is invalid");
			freeMemory = 100;
		} else {
			this.freeMemory = freeMemory;
		}

		if (operationSystem == null || operationSystem.equals("")) {
			System.out.println("Invalid name");
			this.operationSystem = "";
		} else {
			this.operationSystem = operationSystem;
		}

		if (isNotebook != true && isNotebook != false) {
			System.out.println("Did not specify if the computer is a notebook");
			this.isNotebook = false;
		} else {
			this.isNotebook = isNotebook;
		}

	}

	public void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem == null || newOperationSystem.equals("") || operationSystem.equals(newOperationSystem)) {
			System.out.println("Invalid Operation System! Please try again.");
			this.operationSystem = "";
			return;
		}
		this.operationSystem = newOperationSystem;
		System.out.println("Succesfully changed the operation system to: " + this.operationSystem);

	}

	public void useMemory(int memory) {
		if (memory < 0) {
			System.out.println("The memory is negative");
			return;
		}
		if (freeMemory < memory) {
			System.out.println("Not enough free memory");
			return;
		} else {
			this.freeMemory -= memory;
			System.out.println("Success! Free memory left: " + freeMemory);
		}
	}

	public void displayInfo() {
		System.out.println(year + " " + price + " " + isNotebook + " " + hardDiskMemory + " " + freeMemory + " "
				+ operationSystem);
	}
}
