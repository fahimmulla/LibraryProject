import java.util.ArrayList;

public class Library {

	private ArrayList<Items> newLists = new ArrayList<Items>();
	private ArrayList<PersonManager> newList = new ArrayList<PersonManager>();

	public void addToArrays(Items inItems) {
		newLists.add(inItems);
		System.out.println(inItems.getGenre());
	}

	public void addedtoArray(PersonManager inPersonManager) {
		newList.add(inPersonManager);
		System.out.println(inPersonManager.getName());
	}
}
