package workerTask;

public class Demo {

	public static void main(String[] args) {
		Employee john = new Employee("John");
		john.setHoursLeft(9);
		john.setCurrentTask(null);
		john.work();
		john.showReport();
	}

}
