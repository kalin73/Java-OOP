package behavioral.observerPattern;

public class CarFan implements Observer {

	@Override
	public void update(String update) {
		System.out.println("Car fan recieved the update " + update);
	}

}
