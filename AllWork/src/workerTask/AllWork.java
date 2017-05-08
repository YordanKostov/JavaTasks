package workerTask;

public class AllWork {

	private static final int MAX_FREEPLACES = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.freePlacesForTasks = MAX_FREEPLACES;
		this.currentUnassignedTask = 0;
		this.tasks = new Task[freePlacesForTasks];

	}

	void addTask(Task task) {
		for (int index = 0; index < tasks.length; index++) {
			if (this.tasks[index] == null) {
				this.tasks[index] = task;
				this.freePlacesForTasks--;
				break;
			}
		}
	}

	Task getNextTask() {
		return tasks[currentUnassignedTask++];
	}

	boolean isAllWorkDone() {

		for (int index = 0; index < tasks.length; index++) {
			if (this.tasks[index].getWorkingHours() != 0)
				return false;
		}
		return true;

	}

	public int getFreePlacesForTasks() {
		return freePlacesForTasks;
	}

	public int getCurrentUnassaignedTask() {
		return currentUnassignedTask;
	}
}
