package ihavenotime;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import dependencies.Entry;
import dependencies.TransactionBundle;

public class TransactionGateV2 {
	
	private TransactionBundle transactionBundle;

	public void postEntries(List<Entry> entries) {
		List<Entry> entriesToAdd = new LinkedList<Entry>();
		for(Iterator<Entry> it = entries.iterator(); it.hasNext();) {
			Entry entry = it.next();
			if(!transactionBundle.getListManager().hasEntry(entry)) {
				entry.postDate();
				entriesToAdd.add(entry);
			}
		}
		transactionBundle.getListManager().add(entriesToAdd);
	}

	/*
	 * More code. Not shown to keep things simple.
	 */

}