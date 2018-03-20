import java.util.ArrayList;

public class Library {

	private ArrayList<Items> newLists = new ArrayList<Items>();
	private ArrayList<PersonManager> newList = new ArrayList<PersonManager>();

	public void addToArrays(Items inItems) {
		newLists.add(inItems);
	}

	public void addedtoArray(PersonManager inPersonManager) {
		newList.add(inPersonManager);
	}
}
