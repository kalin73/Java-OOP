package Stack_of_Strings;

import java.util.ArrayList;

public class StackOfStrings {
	private ArrayList<String> data = new ArrayList<>();

	public void push(String item) {

		data.add(item);

	}

	public String pop() {

		return data.remove(0);

	}

	public String peek() {

		return data.get(0);

	}

	public boolean isEmpty() {

		return data.isEmpty();

	}
}
