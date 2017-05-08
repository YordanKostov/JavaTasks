package inherit;

public class Employee extends Person {

	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		if (daySalary < 200 && daySalary > 10) {
			this.daySalary = daySalary;
		} else {
			System.out.println("Invalid day salary");
			this.daySalary = 10;
		}
	}
	
	double calculateOvertime(double hours){
		if (hours < 0 && hours > 6) {
			System.out.println("Invalid overtime hours");
			return 0;
		}
		double overtime = 0;
		if (this.getAge() < 18) {
			return 0;
		}else {
			overtime = ((this.daySalary / 8) * hours)*1.5;
			return overtime;
		}
	}
	
	void showEmployeeInfo(){
		this.showPersonInfo();
		System.out.println(" Day salary: " + this.daySalary);
	}
}
