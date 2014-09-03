package dependencies;

public class TransactionBundle {

	private ListManager listManager;
	
	public TransactionBundle() {
		this(new ListManager());
	}
	
	public TransactionBundle(ListManager listManager) {
		this.listManager = listManager;
	}

	public ListManager getListManager() {
		return listManager;
	}

}
