package Wild_Farm;

public abstract class Mammal extends Animal {
	protected String livingRegion;

	protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
		super(animalName, animalType, animalWeight);
		this.livingRegion = livingRegion;
	}

	public String getLivingRegion() {
		return livingRegion;
	}

	@Override
	public String toString() {
		
		return String.format("%s[%s, %s, %s, %d]", this.animalType, this.animalName, df.format(this.animalWeight),
				this.livingRegion, this.foodEaten);
	}
}
