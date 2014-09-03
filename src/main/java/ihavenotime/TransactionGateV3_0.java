package ihavenotime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dependencies.Entry;
import dependencies.TransactionBundle;

public class TransactionGateV3_0 {
	
	private TransactionBundle transactionBundle;

	public TransactionGateV3_0(TransactionBundle transactionBundle) {
		this.transactionBundle = transactionBundle;
	}

	// Example of 'Sprout Method' technique
	public void postEntries(List<Entry> entries) {
		for(Iterator<Entry> it = entries.iterator(); it.hasNext();) {
			Entry entry = it.next();
			entry.postDate();
		}
		transactionBundle.getListManager().add(entries);
	}
	
	// This is the 'Sprout Method'
	protected List<Entry> uniqueEntries(List<Entry> entries) {
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
	 * More code. Hidden to keep things simple.
	 */
	
}