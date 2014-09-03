package dependencies;

import java.util.List;
import java.util.ArrayList;

public class ListManager {
	private List<Entry> listEntries;

	public ListManager() {
		this(new ArrayList<Entry>());
	}

	public ListManager(List<Entry> listEntries) {
		this.listEntries = new ArrayList<Entry>(listEntries);
	}

	public void add(List<Entry> entries) {
		listEntries.addAll(entries);
	}

	public boolean hasEntry(Entry entry) {
		return listEntries.contains(entry);
	}

}
