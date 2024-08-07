package strategyPattern;

import java.util.ArrayList;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();


		PersonLastNameComparator comp = new PersonLastNameComparator();
		PersonLastNameComparator comp2 = new PersonLastNameComparator();
		people.sort(comp2.thenComparing(comp));


	}

}
