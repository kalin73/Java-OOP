package calculator;

import java.util.ArrayDeque;

public class Memory {
	private ArrayDeque<Integer> mem = new ArrayDeque<>();

	public ArrayDeque<Integer> getStorage() {
		return this.mem;
	}
}
