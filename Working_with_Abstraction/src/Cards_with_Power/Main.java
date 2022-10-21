package Cards_with_Power;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rank = sc.nextLine().toUpperCase();
		String suit = sc.nextLine().toUpperCase();
		int power = RankPowers.valueOf(rank).power + SuitPowers.valueOf(suit).value;
		System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, power);
		sc.close();
	}

}
