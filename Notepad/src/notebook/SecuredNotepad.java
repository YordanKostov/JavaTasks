package notebook;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

	Scanner sc = new Scanner(System.in);
	private String password;

	SecuredNotepad(int numOfPages, String password) {
		super(numOfPages);
		if (password == null || password.equals(" ")) {
			System.out.println("Incorrectly created password");
			this.password = "";
			return;
		} else {
			this.password = password;
			return;
		}

	}

	
	boolean checkPass() {

		System.out.println("Please enter the password : ");
		String pass = sc.next();
		if (pass.equals(this.password)) {
			System.out.println("The password is accepted");
			return true;
		} else {
			System.out.println("Wrong password");
			System.out.println("The operation is not done");
			return false;
		}
	}
}
