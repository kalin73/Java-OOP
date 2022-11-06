package Wild_Farm;

public abstract class Food {
	protected Integer quantity;

	protected Food(Integer quantity) {
		this.quantity = quantity;
	}

	public abstract Integer getQuantity();

}
