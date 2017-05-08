package inherit;

public class Demo {

	public static void main(String[] args) {

		Person peio = new Person("Peio", 20, true);
		Person john = new Person("John", 20, true);
		Student petya = new Student("Petya", 16, false, 5.78);
		Student nasko = new Student("Nasko", 25, true, 4.20);
		Employee iva = new Employee("Iva", 14, false, 60);
		Employee naiden = new Employee("Naiden", 38, true, 90);
		
		Person[] people = new Person[10];
		people[0] = peio;
		people[1] = john;
		people[2] = petya;
		people[3] = nasko;
		people[4] = iva;
		people[5] = naiden;
		
		for (int index = 0; index < people.length; index++) {
			if (people[index] instanceof Person  && !(people[index] instanceof Student || people[index] instanceof Employee)) {
				((Person) people[index]).showPersonInfo();
			}
			if (people[index] instanceof Student) {
				((Student) people[index]).showStudentInfo();
			}
			if (people[index] instanceof Employee) {
				((Employee) people[index]).showEmployeeInfo();
			}
		}

		for (int index = 0; index < people.length; index++) {
			if (people[index] instanceof Employee) {
				System.out.println(people[index].getName() + " Gets overtime pay: " );
				System.out.println(((Employee) people[index]).calculateOvertime(2));
			}
		}
	}

}
