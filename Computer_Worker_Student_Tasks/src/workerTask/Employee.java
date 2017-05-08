package workerTask;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;

	public Employee(String name) {
		if (name.equals(" ") || name == null) {
			System.out.println("Invalid name");
			this.name = "";
		} else {
			this.name = name;
		}
	}

	void work() {
		int leftOnTask = 0;
		if (currentTask != null) {
			if (currentTask.getWorkingHours() > this.hoursLeft) {
				leftOnTask = currentTask.getWorkingHours() - this.hoursLeft;
				currentTask.setWorkingHours(leftOnTask);
				this.hoursLeft = 0;
				System.out
						.println("Task hours: " + currentTask.getWorkingHours() + " Employee hours: " + this.hoursLeft);
			}
			if (currentTask.getWorkingHours() < this.hoursLeft) {
				leftOnTask = this.hoursLeft - currentTask.getWorkingHours();
				this.hoursLeft = leftOnTask;
				currentTask.setWorkingHours(0);
				System.out
						.println("Task hours: " + currentTask.getWorkingHours() + " Employee hours: " + this.hoursLeft);
			}
			if (currentTask.getWorkingHours() == this.hoursLeft) {
				currentTask.setWorkingHours(0);
				this.hoursLeft = 0;
				System.out
						.println("Task hours: " + currentTask.getWorkingHours() + " Employee hours: " + this.hoursLeft);
			}
		}else {
			System.out.println("There was no task for the employee");
		}
	}

	void showReport() {
		if (currentTask != null) {
			System.out.println("Employee name: " + this.name + " Task name: " + currentTask.getName()
					+ " Working Hours left: " + this.hoursLeft + " Task hours left: " + currentTask.getWorkingHours());
		}else {
			System.out.println("There was no task to show report of");
		}
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			System.out.println("Invalid Task");
		} else {
			this.currentTask = currentTask;
		}
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0 && hoursLeft <= 8) {
			this.hoursLeft = hoursLeft;
		} else {
			System.out.println("Invalid hours left");
			this.hoursLeft = 0;
		}
	}
}
