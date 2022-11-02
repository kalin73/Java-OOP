package Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {
	private List<String> numbers;
	private List<String> urls;

	public Smartphone(List<String> numbers, List<String> urls) {
		this.numbers = numbers;
		this.urls = urls;
	}

	@Override
	public String call() {
		StringBuilder sb = new StringBuilder("");
		for (String string : numbers) {
			boolean isNumeric = string.matches("\\d*");

			if (!isNumeric) {
				sb.append("Invalid number!\n");
				continue;

			}
			sb.append(String.format("Calling... %s%n", string));

		}
		String result = sb.toString();
		return result;
	}

	@Override
	public String browse() {
		StringBuilder sb = new StringBuilder("");

		for (String string : urls) {
			boolean isURL = string.matches("\\D*");

			if (!isURL) {
				sb.append("Invalid URL!\n");
				continue;
			}
			sb = sb.append(String.format("Browsing: %s!%n", string));
		}
		String result = sb.toString();
		return result;
	}

}
