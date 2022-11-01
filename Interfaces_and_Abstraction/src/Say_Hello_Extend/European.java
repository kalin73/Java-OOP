package Say_Hello_Extend;

public class European extends BasePerson {

	protected European(String name) {
		super(name);
	}

	@Override
	public String sayHello() {
		return "Hello";
	}
}
