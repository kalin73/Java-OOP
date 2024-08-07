package factoryPattern;

public class Main {

	public static void main(String[] args) {
		String cakeType = "ChacoCake";
		double diameter = 10.2;
		double price = 12.5;
		int pieces = 8;

		Cake cake = CakeFactory.createCake(cakeType, diameter, price, pieces);

		System.out.println(cake.price);
	}

}
