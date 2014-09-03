package ihavenotime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dependencies.Entry;
import dependencies.TransactionBundle;

public class TransactionGateV5 implements TransactionGate {
	
	private TransactionBundle transactionBundle;
	private TransactionGate transactionGate;

	public TransactionGateV5(TransactionGate transactionGate, TransactionBundle transactionBundle) {
		this.transactionGate = transactionGate;
		this.transactionBundle = transactionBundle;
	}

	// Example of 'Wrap Class' technique a.k.a Decorator pattern
	public void postEntries(List<Entry> entries) {
		transactionGate.postEntries(uniqueEntries(entries));
	}
	
	private List<Entry> uniqueEntries(List<Entry> entries) {
		List<Entry> result = new ArrayList<Entry>();
		for (Iterator<Entry> it = entries.iterator(); it.hasNext();) {
			Entry entry = (Entry) it.next();
			if(!transactionBundle.getListManager().hasEntry(entry)) {
				result.add(entry);
			}
		}
		return result;
	}

	/*
	 * More code. Not shown to keep things simple.
	 */

}