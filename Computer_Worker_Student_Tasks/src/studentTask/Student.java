package studentTask;

public class Student {
	private String name;
	private String subject;
	private double grade;
	private int yearInCollege;
	private int age;
	private boolean isDegree;
	private double money;

	public Student() {
		this.grade = 4.0f;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		if (name.equals(" ") || name == null) {
			System.out.println("Invalid name");
			this.name = " ";
		} else {
			this.name = name;
		}
		if (subject.equals(" ") || subject == null) {
			System.out.println("Invalid subject");
			this.subject = " ";
		} else {
			this.subject = subject;
		}
		if (age < 18 || age > 30) {
			System.out.println("This person is too young/old to be a student");
			this.age = 20;
		} else {
			this.age = age;
		}

	}

	void upYear() {
		if (this.isDegree == false && this.yearInCollege < 4) {
			this.yearInCollege += 1;
			System.out.println("Successfully passed the school year! Current year: " + this.yearInCollege);
			if (this.yearInCollege == 4) {
				this.isDegree = true;
				System.out.println("Congratulations on graduating!");
			}
		} else {
			System.out.println("The student has already graduated");
		}

	}
	
	public void setGrade(double grade) {
		if (grade > 2 && grade < 6) {
			this.grade = grade;
			System.out.println("Students grade is now: " + this.grade);
		}else {
			System.out.println("Not a valid grade");
			this.grade = 4;
		}
	}

	double receiveScholarship(double min, double amount){
		if (min > 2 && min < 6 && amount > 0 && amount < 2000) {
			if (this.age < 30 && this.grade > min) {
				this.money += amount;
			}else {
				System.out.println("The student is either too old or has low grades");
			}
		}else {
			System.out.println("Entered invalid minimal grade or amount of money");
		}
		return this.money;
	}

	public int getYearInCollege() {
		return yearInCollege;
	}

	public int getAge() {
		return age;
	}

	public String getSubject() {
		return subject;
	}

	public double getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}
	
	
}
