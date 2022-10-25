package Shopping_Spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private double money;
	private List<Product> products = new ArrayList<>();

	public Person(String name, double money) {
		setName(name);
		setMoney(money);
	}

	private void setName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.name = name;
	}

	private void setMoney(double money) {
		if (money < 0) {
			throw new IllegalArgumentException("Money cannot be negative");
		}
		this.money = money;
	}

	public void buyProduct(Product prod) {
		if (money >= prod.getCost()) {
			products.add(prod);
			System.out.printf("%s bought %s%n", name, prod.getName());
			money = money - prod.getCost();

		} else {

			throw new IllegalArgumentException(name + " can't afford " + prod.getName());

		}

	}

	public List<Product> getProducts() {
		return products;
	}

	public String getName() {
		return name;
	}
}
