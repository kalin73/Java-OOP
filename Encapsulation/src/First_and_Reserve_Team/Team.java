package First_and_Reserve_Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
	private String name;
	private List<Person> firstTeam = new ArrayList<>();
	private List<Person> reserveTeam = new ArrayList<>();;

	public Team(String name) {
		this.name = name;
	}

	public Team() {

	}

	public void addPlayer(Person player) {

		if (player.getAge() < 40) {
			firstTeam.add(player);
		} else {
			reserveTeam.add(player);
		}

	}

	public String getName() {
		return name;
	}

	public List<Person> getFirstTeam() {
		List<Person> list = Collections.unmodifiableList(firstTeam);
		return list;
	}

	public List<Person> getReserveTeam() {
		List<Person> list = Collections.unmodifiableList(reserveTeam);
		return list;
	}

}
