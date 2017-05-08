package notebook;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice {

	ElectronicSecuredNotepad(int numOfPages, String password) {
		super(numOfPages, password);
	}

	private int starter = 0;
	int numOfPages;

	@Override
	public void start() {
		if (checkPass() == true) {
			System.out.println("Device started working");
			starter = 1;
		}
	}

	@Override
	public void stop() {
		if (checkPass() == true) {

			System.out.println("Device stopped working");
			starter = 0;
		}
	}

	@Override
	public boolean isStarted() {
		if (starter == 1) {
			System.out.println("The device is working");
			return true;

		} else {
			System.out.println("The device isnt working");
			return false;
		}
	}

}
