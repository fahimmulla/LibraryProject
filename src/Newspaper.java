
public class Newspaper extends Items{

	public Newspaper(String name, double id, String genre, int year, boolean isAvaliable) {
		super(name, id, genre, year, isAvaliable);
		
	}
	
	private boolean hasBroadSheets;

	public boolean hasBroadSheets() {
		return hasBroadSheets;
	}

	public void sethasBroadSheets(boolean hasBroadSheets) {
		this.hasBroadSheets = hasBroadSheets;
	}
}