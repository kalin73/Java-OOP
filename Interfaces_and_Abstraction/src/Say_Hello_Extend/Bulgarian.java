package Say_Hello_Extend;

public class Bulgarian extends BasePerson {

	

	protected Bulgarian(String name) {
		super(name);

	}

	@Override
	public String sayHello() {
		return "ZDR";
	}
}
