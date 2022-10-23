package Traffic_Lights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		long startTime = 0;
		long endTime = 0;

		for (int i = 0; i < 10; i++) {
			arr.add(i);
			list.add(i);
		}

		startTime = System.nanoTime();
		Collections.sort(arr, (f, s) -> Integer.compare(s, f));
		endTime = System.nanoTime();
		System.out.printf("ArrayList time: %d%n", (endTime - startTime));
		System.out.println(arr);

		startTime = System.nanoTime();
		list = list.stream().sorted((f, s) -> Integer.compare(s, f)).collect(Collectors.toList());
		endTime = System.nanoTime();
		System.out.printf("ArrayList time: %d%n", (endTime - startTime));
		System.out.println(list);

	}
}