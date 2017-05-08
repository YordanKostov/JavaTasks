package inherit;

public class Student extends Person{
	
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		if (score >= 2 && score <= 6) {
			this.score = score;
		}else {
			System.out.println("Invalid score");
			this.score = 2;
		}
	}
	
	void showStudentInfo(){
		this.showPersonInfo();
		System.out.println(" Score: " + this.score);
	}

	
	
}
