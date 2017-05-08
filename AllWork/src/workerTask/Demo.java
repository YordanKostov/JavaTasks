package workerTask;

public class Demo {

	public static void main(String[] args) {
		AllWork job = new AllWork();
		Task cleanFloor = new Task("Cleaning the floor", 5);
		Task washDishes = new Task("Washing the dishes", 3);
		Task cleanWindow = new Task("Clean the windows", 2);
		Task vacuum = new Task("Vacuum", 7);
		Task readManual = new Task("Read book", 4);
		Task sing = new Task("Sing", 6);
		Task cook = new Task("Cook", 6);
		Task laundry = new Task("Laundry", 5);
		Task fixLaptop = new Task("Fix Laptop", 4);
		Task washTheCar = new Task("Wash the car", 2);
		Employee stoicho = new Employee("Stoicho");
		Employee gosho = new Employee("Gosho");
		Employee nasko = new Employee("Nasko");

		job.addTask(cleanFloor);
		job.addTask(washDishes);
		job.addTask(cleanWindow);
		job.addTask(vacuum);
		job.addTask(readManual);
		job.addTask(sing);
		job.addTask(cook);
		job.addTask(laundry);
		job.addTask(fixLaptop);
		job.addTask(washTheCar);

		gosho.setAllwork(job);
		nasko.setAllwork(job);

		while (job.isAllWorkDone() == false) {
			gosho.startWorkingDay();
			nasko.startWorkingDay();

			while (gosho.getHoursLeft() != 0 || gosho.getCurrentTask() == null) {
				gosho.work();
			}
			while(nasko.getHoursLeft() != 0 || nasko.getCurrentTask() == null){
				nasko.work();
			}
		}

		System.out.println();
		System.out.println("All tasks are done !!!");

	}

}
