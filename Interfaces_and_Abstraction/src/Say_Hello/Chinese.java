package Say_Hello;

public class Chinese implements Person {
	private String name;

	public Chinese(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String sayHello() {
		String hello = "Djydjybydjy";
		return hello;
	}

}
