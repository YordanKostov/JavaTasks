package callGSM;
import java.util.Arrays;

public class GSM {

	private String model;
	private boolean hasSimCard;
	private int[] simMobileNumber;
	private int outgoingCallsDuration = 0;
	private int[] lastIncomingCall;
	private int[] lastOutgoingCall;

	public GSM(String model) {
		if (model.equals(" ") || model == null) {
			System.out.println("Invalid mobile model");
			return;
		} else {
			this.model = model;
		}

	}

	void insertSimCard(int[] simMobileNumber) {
		if (simMobileNumber.length == 10 && simMobileNumber[0] == 0 && simMobileNumber[1] == 8) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
			System.out.println("SIM card successfully installed");
		} else {
			System.out.println("Invalid Mobile Number. SIM card not inserted");
		}
	}

	void removeSimCard() {
		this.simMobileNumber = new int[simMobileNumber.length];
		this.hasSimCard = false;
	}

	void call(GSM receiver, int duration) {
		if ((duration > 1) && (duration < 60) && (Arrays.equals(receiver.simMobileNumber, this.simMobileNumber) == false)
				&& (receiver.hasSimCard == true) && (this.hasSimCard == true)) {
			this.lastOutgoingCall = receiver.simMobileNumber;
			receiver.lastIncomingCall = this.simMobileNumber;
			this.outgoingCallsDuration += duration;
			System.out.println(Arrays.toString(this.simMobileNumber) + " called "
					+ Arrays.toString(receiver.simMobileNumber) + " for " + duration + " minutes");
		} else {
			System.out.println("Check if both phones have SIM cards installed and if the duration of the call is between 1 and 60 minutes");
		}
	}

	long getSumForCall() {
		long sum = this.outgoingCallsDuration *= Call.getPriceForAMinute();
		return sum;
	}

	void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall[0] != 0 && this.lastIncomingCall[1] != 8 && this.lastIncomingCall.length != 10) {
			System.out.println("There are no past incoming calls");
		} else {
			System.out.println("Last incoming call:" + " " + Arrays.toString(this.lastIncomingCall));

		}
	}

	void printInfoForTheLastOutgoingingCall() {
		System.out.println("Last incoming call:" + " " + Arrays.toString(this.lastOutgoingCall) + " lasted ");
	}
}
