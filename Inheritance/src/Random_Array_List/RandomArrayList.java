package Random_Array_List;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public T getRandomElement() {

		return super.remove(getRandomIndex());
	}

	private int getRandomIndex() {
		Random rn = new Random();
		return rn.nextInt(super.size());

	}
}
