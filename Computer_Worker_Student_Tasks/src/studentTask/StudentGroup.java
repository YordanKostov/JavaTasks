package studentTask;

public class StudentGroup {

	private String groupSubject;
	private Student[] students;
	private int freeSpaces;

	public StudentGroup() {
		this.students = new Student[5];
		this.freeSpaces = 5;
	}

	public StudentGroup(String subject) {
		this();
		if (subject == null || subject.equals(" ")) {
			System.out.println("Invalid subject. Try again");
			subject = " ";
		} else {
			this.groupSubject = subject;
		}
	}

	void addStudent(Student stud) {
		if (stud.getSubject().equals(this.groupSubject) && this.freeSpaces > 0 && stud != null) {
			students[students.length - this.freeSpaces] = stud;
			this.freeSpaces -= 1;
			System.out.println(stud.getName() + " Has been accepted to the group: " + this.groupSubject);
		} else {
			System.out.println("There are either no free spaces or theres a difference is the subjects");
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		this.freeSpaces = 5;
		System.out.println("Emptied the group: " + this.groupSubject);
	}

	void theBestStudent() {
		double highestGrade = 0;
		Student boss = null;
		for (int index = 0; index < students.length; index++) {
			if (students[index] != null) {
				if (students[index].getGrade() > highestGrade) {
					highestGrade = students[index].getGrade();
					boss = students[index];
				}else {
					break;
				}
				System.out.println("Best student is: " + boss.getName() + " with grade: " + highestGrade);
			}
		}
	}

	void printStudentsInGroup() {
		for (int index = 0; index < students.length; index++) {
			if (students[index] == null) {
				System.out.println("There are no more students in this group");
				break;
			} else {
				System.out.println("Name: " + students[index].getName() + " Age: " + students[index].getAge()
						+ " Year in College: " + students[index].getYearInCollege() + " Subject: "
						+ students[index].getSubject());
			}
		}
	}
}
