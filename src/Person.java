
public class Person extends PersonManager {

	public Person(String name, int id, int yearJoined) {
		super(name, id, yearJoined);
		
	}
	private String name;
	private int id;
	private int yearJoined;

	private boolean hasmembership;

	public boolean hasmembership() {
		return hasmembership;
	}

	public void sethasmembership(boolean hasmembership) {
		this.hasmembership = hasmembership;
	}
}
	
	
