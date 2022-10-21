package Card_Rank;

public class Main {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Card Ranks:");
		for (Cards card : Cards.values()) {

			System.out.printf("Ordinal value: %d; Name value: %s%n", count, card);
			count++;

		}

	}

}
