package Hotel_Reservation;

public enum DiscType {
	VIP(0.2), SECONDVISIT(0.1), NONE(0.0);

	final double discount;

	DiscType(double discount) {
		this.discount = discount;
	}
}
