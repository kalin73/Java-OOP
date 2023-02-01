package barracksWars.core.commands;

import barracksWars.annotations.Inject;
import barracksWars.interfaces.Repository;

public class RetireCommand extends Command {
	@Inject
	private Repository repository;

	public RetireCommand(String[] data) {
		super(data);
	}

	@Override
	public String execute() {
		try {
			repository.removeUnit(getData()[1]);
		} catch (Exception e) {
			return e.getMessage();
		}

		return getData()[1] + " retired!";
	}

}
