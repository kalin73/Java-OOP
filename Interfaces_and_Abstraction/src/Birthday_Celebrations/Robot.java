package Birthday_Celebrations;

public class Robot implements Identifiable {
	private String id;
	private String model;

	public Robot(String id, String model) {
		this.model = model;
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}

	public String getModel() {
		return this.model;
	}
}
