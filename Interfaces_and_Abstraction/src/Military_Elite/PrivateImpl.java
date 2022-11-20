package Military_Elite;

public class PrivateImpl extends SoldierImpl implements Private {

	protected double salary;

	public PrivateImpl(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName);
		this.salary = salary;
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %d Salary: %.2f", this.firstName, this.lastName, this.id, this.salary);
	}
}
