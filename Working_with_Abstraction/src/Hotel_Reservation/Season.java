package Hotel_Reservation;

enum Season {
	AUTUMN(1), SPRING(2), WINTER(3), SUMMER(4);

	final int multiplier;

	Season(int multiplier) {
		this.multiplier = multiplier;
	}
}
