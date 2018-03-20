
public abstract class Items {

	private String name;
	private double id;
	private String genre;
	private int year;
	private boolean isAvaliable;

	public Items(String name, double id, String genre, int year, boolean isAvaliable) {
		this.name = name;
		this.id = id;
		this.genre = genre;
		this.year = year;
		this.isAvaliable = isAvaliable;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public boolean isAvaliable() {
		return isAvaliable;
	}

	public void setAvaliable(boolean isAvaliable) {
		this.isAvaliable = isAvaliable;
	}
}


