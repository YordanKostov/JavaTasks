package inherit;

public class Person {

	private String name;
	private int age;
	private boolean isMale;
	
	public Person(String name, int age, boolean isMale){
		if ( name == null || name.equals(" ")) {
			System.out.println("Invalid name");
			this.name = "";
		}else {
			this.name = name;
		}
		if (age > 0 && age < 120) {
			this.age = age;
		}else {
			System.out.println("Invalid age");
			this.age = 1;
		}
		if (isMale != false && isMale != true) {
			System.out.println("Invalid gender");
			this.isMale = false;
		}else {
			this.isMale = isMale;
			
		}
	}
	
	public int getAge() {
		return age;
	}

	void showPersonInfo(){
		System.out.print("Name: " + this.name + " Age: " + this.age + " Gender: ");
		if (this.isMale == true) {
			System.out.println("Male" );
		}else {
			System.out.println("Female" );
		}
	}

	public String getName() {
		return name;
	}
}
