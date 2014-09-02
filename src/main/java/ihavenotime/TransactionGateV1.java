package ihavenotime;

import java.util.Iterator;
import java.util.List;

import dependencies.Entry;
import dependencies.TransactionBundle;

public class TransactionGateV1 {
	
	private TransactionBundle transactionBundle;

	public void postEntries(List<Entry> entries) {
		for(Iterator<Entry> it = entries.iterator(); it.hasNext();) {
			Entry entry = it.next();
			entry.postDate();
		}
		transactionBundle.getListManager().add(entries);
	}
	
	/*
	 * More code. Not shown to keep things simple.
	 */

}