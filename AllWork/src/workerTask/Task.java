package workerTask;

public class Task {

	private String name;
	private double workingHours;

	public Task(String name, int workingHours) {
		if (name.equals(" ") || name == null) {
			System.out.println("Invalid name");
			this.name = "";
		} else {
			this.name = name;
		}
		if (workingHours >= 0 && workingHours <= 8) {
			this.workingHours = workingHours;
		} else {
			System.out.println("Invalid working hours");
			this.workingHours = 0;
		}
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double taskHoursLeft) {
		if (taskHoursLeft >= 0 && taskHoursLeft <= 8) {
			this.workingHours = taskHoursLeft;
		} else {
			System.out.println("Invalid working hours");
			this.workingHours = 0;
		}
	}

	public String getName() {
		return name;
	}

}
