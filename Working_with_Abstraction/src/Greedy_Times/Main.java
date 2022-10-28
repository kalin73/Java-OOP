package Greedy_Times;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		long input = Long.parseLong(scanner.nextLine());
		String[] safe = scanner.nextLine().split("\\s+");

		LinkedHashMap<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
		long gold = 0;
		long gems = 0;
		long money = 0;

		for (int i = 0; i < safe.length; i += 2) {
			String item = safe[i];
			long count = Long.parseLong(safe[i + 1]);

			String itemType = checkItemType(item);

			if (itemType.equals("")) {
				continue;
			} else if (input < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e)
					.sum() + count) {
				continue;
			}

			if (checkItemCount(itemType, bag, count)) {
				continue;
			}
			bag = addToBag(bag, itemType, item, count);
			calculate(itemType, gold, gems, money, count);
		}
		printResult(bag);
		scanner.close();
	}

	public static boolean checkItemCount(String itemType, LinkedHashMap<String, LinkedHashMap<String, Long>> bag,
			long count) {
		boolean skip = false;
		switch (itemType) {
		case "Gem":
			if (!bag.containsKey(itemType)) {
				if (bag.containsKey("Gold")) {
					if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
						skip = true;
						break;
					}
				} else {
					skip = true;
					break;
				}
			} else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gold").values()
					.stream().mapToLong(e -> e).sum()) {
				skip = true;
				break;
			}
			break;
		case "Cash":
			if (!bag.containsKey(itemType)) {
				if (bag.containsKey("Gem")) {
					if (count > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
						skip = true;
						break;
					}
				} else {
					skip = true;
					break;
				}
			} else if (bag.get(itemType).values().stream().mapToLong(e -> e).sum() + count > bag.get("Gem").values()
					.stream().mapToLong(e -> e).sum()) {
				skip = true;
				break;
			}
			break;
		}
		return skip;
	}

	public static LinkedHashMap<String, LinkedHashMap<String, Long>> addToBag(
			LinkedHashMap<String, LinkedHashMap<String, Long>> bag, String itemType, String item, long count) {

		if (!bag.containsKey(itemType)) {
			bag.put((itemType), new LinkedHashMap<String, Long>());
		}

		if (!bag.get(itemType).containsKey(item)) {
			bag.get(itemType).put(item, 0L);
		}

		bag.get(itemType).put(item, bag.get(itemType).get(item) + count);

		return bag;
	}

	public static String checkItemType(String item) {
		String itemType = "";
		if (item.length() == 3) {
			itemType = "Cash";
		} else if (item.toLowerCase().endsWith("gem")) {
			itemType = "Gem";
		} else if (item.toLowerCase().equals("gold")) {
			itemType = "Gold";
		}
		return itemType;
	}

	public static void calculate(String itemType, long gold, long gems, long money, long count) {
		if (itemType.equals("Gold")) {
			gold += count;
		} else if (itemType.equals("Gem")) {
			gems += count;
		} else if (itemType.equals("Cash")) {
			money += count;
		}
	}

	public static void printResult(LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
		for (var x : bag.entrySet()) {
			Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

			System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

			x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
					.forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

		}
	}
}
