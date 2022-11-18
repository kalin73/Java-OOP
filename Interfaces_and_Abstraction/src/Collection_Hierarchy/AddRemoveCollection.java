package Collection_Hierarchy;

public class AddRemoveCollection extends Collection implements AddRemovable {
public AddRemoveCollection() {
	super();
}
	@Override
	public int add(String element) {
		items.add(0,element);
		return 0;
	}

	@Override
	public String remove() {
		int lastElement = items.size() - 1;
		return items.remove(lastElement);
	}

}
