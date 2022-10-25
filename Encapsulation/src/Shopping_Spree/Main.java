package Shopping_Spree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] people = sc.nextLine().split(";");
		String[] products = sc.nextLine().split(";");
		List<Person> ppl = new ArrayList<>();
		List<Product> prods = new ArrayList<>();

		for (int i = 0; i < people.length; i++) {
			String[] arr = people[i].split("=");
			ppl.add(new Person(arr[0], Double.parseDouble(arr[1])));
		}

		for (int i = 0; i < products.length; i++) {
			String[] arr = products[i].split("=");
			prods.add(new Product(arr[0], Double.parseDouble(arr[1])));
		}

		fillBags(sc, ppl, prods);
		printShoppingBags(ppl);
	}

	public static void printShoppingBags(List<Person> ppl) {
		for (Person p : ppl) {
			if (p.getProducts().isEmpty()) {
				System.out.printf("%s - Nothing bought%n", p.getName());
			} else {
				System.out.printf("%s - ", p.getName());
				for (Product pr : p.getProducts()) {
					System.out.printf("%s, ", pr.getName());
				}
				System.out.println();
			}

		}
	}

	public static void fillBags(Scanner sc, List<Person> ppl, List<Product> prods) {

		String[] input = sc.nextLine().split(" ");
		while (!input[0].equals("END")) {
			String name = input[0].trim();
			String prodName = input[1].trim();

			for (Person p : ppl) {
				if (p.getName().equals(name)) {
					for (Product pr : prods) {
						if (pr.getName().equals(prodName)) {
							try {
								p.buyProduct(pr);
							} catch (IllegalArgumentException ex) {
								System.out.printf("%s can't afford %s%n", p.getName(), pr.getName());
							}
							break;
						}
					}
					break;
				}
			}

			input = sc.nextLine().split(" ");
		}

	}
}
