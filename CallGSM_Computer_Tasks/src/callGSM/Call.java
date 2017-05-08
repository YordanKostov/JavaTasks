package callGSM;

public class Call {

	private static float priceForAMinute = 0.5f;
	private int[] caller = new int[10];
	private int[] receiver = new int[10];
	private int duration = 0;

	public Call(int[] caller, int[] receiver, int duration) {
		if (caller.length == 10 && caller[0] == 0 && caller[1] == 8) {
			this.caller = caller;
		} else {
			System.out.println("The caller has an invalid number");
			return;
		}

		if (receiver.length == 10 && receiver[0] == 0 && receiver[1] == 8) {
			this.receiver = receiver;
		} else {
			System.out.println("The receiver has an invalid number");
			return;
		}

		if (duration < 1) {
			System.out.println("The duration of the call is less than 1");
			return;
		} else {
			this.duration = duration;
		}
	}

	public void setCaller(int[] caller) {
		this.caller = caller;
	}

	public void setReceiver(int[] receiver) {
		this.receiver = receiver;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public static float getPriceForAMinute() {
		return priceForAMinute;
	}
}
