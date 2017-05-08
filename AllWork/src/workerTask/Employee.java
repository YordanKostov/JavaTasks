package workerTask;

public class Employee {

	private String name;
	private Task currentTask;
	private int hoursLeft;
	private AllWork allwork;

	public Employee(String name) {
		if (name.equals(" ") || name == null) {
			System.out.println("Invalid name");
			this.name = "";
		} else {
			this.name = name;
		}
	}

	void startWorkingDay() {
		this.hoursLeft = 8;
		System.out.println("Starts a new work day");
	}

	public AllWork getAllwork() {
		return allwork;
	}

	public void setAllwork(AllWork allwork) {
		if (allwork != null) {
			this.allwork = allwork;
		} else {
			System.out.println("Enter allwork again");
		}
	}

	public String getName() {
		return name;
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	void work() {

		if (allwork.getCurrentUnassaignedTask() == 10 && currentTask.getWorkingHours() == 0) {
			this.hoursLeft = 0;
			return;
		}
		if (this.getCurrentTask() == null || this.getCurrentTask().getWorkingHours() == 0) {
			if (allwork.getCurrentUnassaignedTask() == 10) {
				System.out.println("Workday for " + this.name + " is over");
				System.out.println(this.currentTask.getWorkingHours());
				this.hoursLeft = 0;
				this.currentTask.setWorkingHours(0);
				return;
			}
			this.setCurrentTask(allwork.getNextTask());
		}

		System.out.println(this.name + " started " + currentTask.getName());
		if (this.hoursLeft >= this.currentTask.getWorkingHours()) {
			this.hoursLeft -= this.currentTask.getWorkingHours();
			System.out
					.println(this.name + " finished " + this.currentTask.getName() + " (hours left for the day ) : " + this.hoursLeft);
			this.currentTask.setWorkingHours(0);
			if (this.hoursLeft > 0) {
				if (this.allwork.getCurrentUnassaignedTask() == 10) {
					System.out.println("Workday for " + this.name + " is over");
					this.hoursLeft = 0;
					this.currentTask.setWorkingHours(0);
					return;
				}
				this.setCurrentTask(allwork.getNextTask());
				System.out.println("Employee " + this.name + " started " + this.currentTask.getName());
			} else {
				System.out.println("Workday for " + name + " is over");
			}
		}
		if (this.hoursLeft < this.currentTask.getWorkingHours()) {
			double taskHoursLeft = this.currentTask.getWorkingHours() - this.hoursLeft;
			this.hoursLeft = 0;
			this.currentTask.setWorkingHours(taskHoursLeft);
			System.out.println("The work day for " + this.name + " is over");
			System.out.println(taskHoursLeft + " left for finishing the " + this.currentTask.getName());
		}
	}

	void showReport() {
		if (this.currentTask != null) {
			System.out.println("Employee name: " + this.name + " Task name: " + currentTask.getName()
					+ " Working Hours left: " + this.hoursLeft + " Task hours left: " + currentTask.getWorkingHours());
		} else {
			System.out.println("There was no task to show report of");
		}
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask == null) {
			System.out.println("Invalid Task");
			return;
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
