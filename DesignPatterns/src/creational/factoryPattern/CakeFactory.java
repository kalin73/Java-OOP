package creational.factoryPattern;

public class CakeFactory {
	public static Cake createCake(String cakeType, double diameter, double price, int pieces) {

		Cake cake = null;

		switch (cakeType) {
		case "ChacoCake":
			cake = new ChocoCake(diameter, price, pieces);
			break;

		case "FruitCake":
			cake = new FruitCake(diameter, price, pieces);
			break;

		case "SpinachCake":
			cake = new SpinachCake(diameter, price, pieces);
			break;

		default:
			break;
		}
		return cake;

	}

}
