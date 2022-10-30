package Football_Team_Generator;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private List<Player> players;

	public Team(String name) {
		this.setName(name);
		this.players = new ArrayList<>();
	}

	public Team() {

	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		throwException(name);
		this.name = name;
	}

	public void addPlayer(Player player) {
		this.players.add(player);
	}

	public void removePlayer(String name) {
		this.players.removeIf(player -> name.equals(player.getName()));
	}

	public boolean hasPlayer(String name) {
		return players.stream().anyMatch(player -> name.equals(player.getName()));
	}

	public double getRating() {
		return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0.0);
	}

	private void throwException(final String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("A name should not be empty.");
		}
	}
}
