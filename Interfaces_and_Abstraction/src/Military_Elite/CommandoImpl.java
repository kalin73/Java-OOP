package Military_Elite;

import java.util.ArrayList;
import java.util.List;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
	private List<Mission> missions;

	public CommandoImpl(int id, String firstName, String lastName, double salary, String corps) {
		super(id, firstName, lastName, salary, corps);
		this.missions = new ArrayList<>();
	}

	public void addMission(Mission mission) {
		if (mission.getState() != null) {
			missions.add(mission);
		}
	}

	@Override
	public List<Mission> getMissions() {
		return this.missions;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
