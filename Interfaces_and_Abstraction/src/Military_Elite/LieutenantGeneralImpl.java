package Military_Elite;

import java.util.ArrayList;
import java.util.List;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {
	private List<PrivateImpl> privates;

	public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
		super(id, firstName, lastName, salary);
		this.privates = new ArrayList<>();
	}

	public void addPrivate(PrivateImpl priv) {
		this.privates.add(priv);
	}

	@Override
	public List<PrivateImpl> getPirvates() {
		return this.privates;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public void sort() {
		privates.sort((f,s)->Integer.compare(s.getId(), f.getId()));
	}
}
