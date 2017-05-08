
package studentTask;

public class College {

	public static void main(String[] args) {
		Student gosho = new Student("Gosho", "Math", 23);
		Student pesho = new Student("Pesho", "Geo", 21);
		Student petya = new Student("Petya", "Math", 20);
		
		StudentGroup math = new StudentGroup("Math");
		
		petya.upYear();
		System.out.println(petya.receiveScholarship(3, 150));
		System.out.println(petya.receiveScholarship(3, 70));

		math.addStudent(petya);
		math.addStudent(gosho);
		math.addStudent(pesho);
		petya.setGrade(5.69);
		math.printStudentsInGroup();
		math.theBestStudent();
	}

}
