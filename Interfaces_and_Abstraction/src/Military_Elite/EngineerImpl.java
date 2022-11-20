package Military_Elite;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
	private List<Repair> repairs;

	public EngineerImpl(int id, String firstName, String lastName, double salary, String corps) {
		super(id, firstName, lastName, salary, corps);
		repairs = new ArrayList<>();
	}

	public void addRepair(Repair repair) {
		repairs.add(repair);
	}

	@Override
	public List<Repair> getRepairs() {

		return this.repairs;

	}

	@Override
	public String toString() {
		return super.toString();
	}
}
