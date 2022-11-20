package Military_Elite;

public class SpyImpl extends SoldierImpl implements Spy {
	private String codeNumber;

	public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
		super(id, firstName, lastName);
		this.codeNumber = codeNumber;
	}

	@Override
	public String getCodeNumber() {
		return this.codeNumber;
	}

	@Override
	public String toString() {
		return String.format("Name: %s %s Id: %d%nCode Number: %s", this.firstName, this.lastName, this.id,
				this.codeNumber);
	}
}
