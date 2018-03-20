
public class Books extends Items {

	public Books(String name, double id, String genre, int year, boolean isAvaliable) {
		super(name, id, genre, year, isAvaliable);
	}

	private boolean hasHardCovers;

	public boolean hasHardCovers() {
		return hasHardCovers;
	}

	public void sethasHardCovers(boolean hasHardCovers) {
		this.hasHardCovers = hasHardCovers;
	}
}
