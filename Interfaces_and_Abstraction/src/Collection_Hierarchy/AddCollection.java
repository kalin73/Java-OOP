package Collection_Hierarchy;

public class AddCollection extends Collection implements Addable {

	public AddCollection() {
		super();
	}

	@Override
	public int add(String element) {
		items.add(element);
		return items.size() - 1;
	}

}
