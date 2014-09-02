package ihavenotime;

import java.util.List;

import dependencies.Entry;

public interface TransactionGate {

	public void postEntries(List<Entry> entries);

}
