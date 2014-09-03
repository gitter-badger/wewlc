package dependencies;

public class Entry {

	private int year;
	private int month;
	private int dayOfMonth;

	public Entry(int year, int month, int dayOfMonth) {
		this.year = year;
		this.month = month;
		this.dayOfMonth = dayOfMonth;
	}

	public void postDate() { }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entry other = (Entry) obj;
		if (dayOfMonth != other.dayOfMonth)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dayOfMonth;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
}
