package Collection_Hierarchy;

public class MyListImpl extends Collection implements MyList {
	private int used;

	public MyListImpl() {
		super();
	}

	@Override
	public String remove() {
		return this.items.remove(0);
	}

	@Override
	public int add(String element) {
		this.items.add(0, element);
		return 0;
	}

	@Override
	public int getUsed() {
		used = this.items.size();
		return used;
	}

}
