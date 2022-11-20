package Military_Elite;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

	private Corps corps;

	public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
		super(id, firstName, lastName, salary);
		setCorps(corps);
	}

	@Override
	public void setCorps(String corps) {
		if (!corps.equals("Airforces") && !corps.equals("Marines")) {
			throw new IllegalArgumentException("invalid corps");
		}

		this.corps = Corps.valueOf(corps);

	}

	@Override
	public Corps getCorps() {
		return this.corps;
	}

	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %d Salary: %.2f", this.firstName, this.lastName, this.id, this.salary)
				+ "\nCorps: " + this.corps;
	}
}
