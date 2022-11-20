package Military_Elite;

public class SoldierImpl implements Soldier {
	protected int id;
	protected String firstName;
	protected String lastName;

	public SoldierImpl(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

}
