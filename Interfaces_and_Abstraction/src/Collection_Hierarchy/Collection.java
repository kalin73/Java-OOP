package Collection_Hierarchy;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection implements Addable{

	protected int maxSize = 100;
	protected List<String> items;

	protected Collection() {
		items = new ArrayList<>(100);
	}

}
