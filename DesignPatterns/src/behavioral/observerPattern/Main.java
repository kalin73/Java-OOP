package behavioral.observerPattern;

public class Main {

	public static void main(String[] args) {
		Observer fan1 = new CarFan();
		Observer fan2 = new CarFan();
		Observer fan3 = new CarFan();

		Subject topGearShow = new TopGearShow();

		topGearShow.register(fan1);
		topGearShow.register(fan2);
		topGearShow.register(fan3);

		topGearShow.notify("Mercedes");
		topGearShow.notify("BMW");
		topGearShow.notify("Audi");

	}

}
