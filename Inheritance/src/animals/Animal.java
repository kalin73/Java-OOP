package animals;

public class Animal {
	private String name;
	private int age;
	protected String gender;

	public Animal(String name, int age, String gender) {
		setName(name);
		setAge(age);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		if (name.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age < 1) {
			throw new IllegalArgumentException("Invalid input!");
		}
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		if (!(gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female"))) {

			throw new IllegalArgumentException("Invalid input!");
		}
		this.gender = gender;
	}

	public String produceSound() {
		return "";

	}

	@Override
	public String toString() {

		return String.format("%s%n%s %d %s%n%s", this.getClass().getSimpleName(), getName(), getAge(), getGender(),
				produceSound());
	}
}
