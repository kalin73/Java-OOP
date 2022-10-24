package First_and_Reserve_Team;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Team team = new Team("Man Utd");
		int n = Integer.parseInt(sc.nextLine());
		List<Person> players = Person.createList(sc, n);

		for (Person p : players) {
			team.addPlayer(p);

		}
		System.out.printf("First team have %s players%n", team.getFirstTeam().size());
		System.out.printf("Reserve team have %s players", team.getReserveTeam().size());
	}

}
