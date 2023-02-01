package barracksWars.core.commands;

import barracksWars.interfaces.Executable;
import barracksWars.interfaces.Repository;
import barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {

	private String[] data;
	private Repository repository;
	private UnitFactory unitFactory;

	protected Command(String[] data) {
		this.data = data;
	}

	protected Repository getRepository() {
		return this.repository;
	}

	protected UnitFactory getUnitFactory() {
		return this.unitFactory;
	}

	protected String[] getData() {
		return this.data;
	}
}
