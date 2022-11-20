package Military_Elite;

public class Mission {
	private String codeName;
	private State state;

	public Mission(String codeName, String state) {
		setState(state);
		this.codeName = codeName;
	}

	public void completeMission() {
		this.state = State.finished;
	}

	public String getCodeName() {
		return codeName;
	}

	public State getState() {
		return state;
	}

	private void setState(String mission) {
		if (!mission.equals("inProgress") && !mission.equals("finished")) {
			return;
		}

		this.state = State.valueOf(mission);
	}

	@Override
	public String toString() {
		return "Code Name: " + this.codeName + " State: " + this.state;
	}
}
