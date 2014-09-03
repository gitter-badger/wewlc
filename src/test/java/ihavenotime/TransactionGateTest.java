package ihavenotime;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import dependencies.Entry;
import dependencies.ListManager;
import dependencies.TransactionBundle;

public class TransactionGateTest {

	@Test
	public void givenListWithEntryAlreadyPresentInListManager_uniqueList_returnsEmptyList() {
		ListManager listManagerWithEntry = new ListManager(Arrays.asList(anEntry()));
		TransactionGateV3_0 transactionGate = new TransactionGateV3_0(new TransactionBundle(listManagerWithEntry));
		
		List<Entry> uniqueEntries = transactionGate.uniqueEntries(Arrays.asList(anEntry()));
		assertEquals(0, uniqueEntries.size());
	}

	@Test
	public void givenListWithEntryNotPresentInListManager_uniqueList_returnsList() {
		ListManager emptyListManager = new ListManager();
		TransactionGateV3_0 transactionGate = new TransactionGateV3_0(new TransactionBundle(emptyListManager));
		
		List<Entry> uniqueEntries = transactionGate.uniqueEntries(Arrays.asList(anEntry()));
		assertEquals(1, uniqueEntries.size());
	}

	private Entry anEntry() {
		return new Entry(2014,9,30);
	}

}
