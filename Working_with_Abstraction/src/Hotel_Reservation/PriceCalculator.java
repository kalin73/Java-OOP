package Hotel_Reservation;

public class PriceCalculator {

	public void calculate(String[] inp) {
		double price = Double.parseDouble(inp[0]);
		int days = Integer.parseInt(inp[1]);
		String season = inp[2];
		String dicountType = inp[3];
		double totalPrice = 0;

		totalPrice = Season.valueOf(season.toUpperCase()).multiplier * price * days;
		totalPrice -= (totalPrice * DiscType.valueOf(dicountType.toUpperCase()).discount);
		System.out.printf("%.2f", totalPrice);
	}
}
