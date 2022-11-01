package Say_Hello_Extend;

public class Chinese extends BasePerson {

	protected Chinese(String name) {
		super(name);
	}

	@Override
	public String sayHello() {
		return "Djydjybydjy";
	}
}
