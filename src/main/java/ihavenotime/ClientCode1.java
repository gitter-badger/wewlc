package ihavenotime;

import java.util.List;

import dependencies.Entry;

public class ClientCode1 {

	private TransactionGateV1 transactionGate;

	public void doAllTheThings() {
		// --------------------------------
		// --------------------------------
		// --------------------------------
		if (condition1) {
			if (condition2 || condition3) {
				// --------------------------------
				// --------------------------------
				// --------------------------------
				transactionGate.postEntries(getEntries());
				// --------------------------------
				// --------------------------------
				// --------------------------------
			} else if (!condition4 && is3rdTuesdayOfTheMonth()) {
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
				transactionGate.postEntries(getEntries());
			} else {
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
				// --------------------------------
			}
			// --------------------------------
			// --------------------------------
			// --------------------------------
		} else {
			// --------------------------------
			// --------------------------------
			// --------------------------------
			if (!postingDisabled()) {
				transactionGate.postEntries(getEntries());
			}
		}
		/*
		 * More code. Not shown to keep things simple.
		 * --------------------------------
		 */
	}

	private boolean postingDisabled() {
		return false;
	}

	private List<Entry> getEntries() {
		List<Entry> entries = null;
		// get all these entries in a complicated manner
		return entries;
	}

	/*
	 * More code. Not shown to keep things simple.
	 */

	boolean condition1, condition2, condition3, condition4;

	private boolean is3rdTuesdayOfTheMonth() {
		return false;
	}
}