package singletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Datastore {
	private static Datastore instance;

	private List<Integer> database;

	private Datastore() {
		database = new ArrayList<>();
	}

	public static Datastore getInstance() {
		if (instance == null) {
			synchronized (Datastore.class) {
				if (instance == null) {
					instance = new Datastore();
				}
			}
		}
		return instance;
	}

	public void add(Integer value) {
		database.add(value);
	}

	public Integer get(int index) {
		return database.get(index);
	}
}
