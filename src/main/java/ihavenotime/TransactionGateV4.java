package ihavenotime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dependencies.Entry;
import dependencies.TransactionBundle;

public class TransactionGateV4 {
	
	private TransactionBundle transactionBundle;

	public TransactionGateV4(TransactionBundle transactionBundle) {
		this.transactionBundle = transactionBundle;
	}

	// Example of 'Wrap Method' technique
	public void postEntries(List<Entry> entries) {
		List<Entry> entriesToAdd = uniqueEntries(entries);
		post(entriesToAdd);
	}

	private void post(List<Entry> entries) {
		for(Iterator<Entry> it = entries.iterator(); it.hasNext();) {
			Entry entry = it.next();
			entry.postDate();
		}
		transactionBundle.getListManager().add(entries);
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