package Cards_with_Power;

public enum SuitPowers {
	CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

	final int value;

	SuitPowers(int value) {
		this.value = value;
	}
}
