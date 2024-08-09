package creational.singletonPattern;

public class Main {

	public static void main(String[] args) {
		Datastore database = Datastore.getInstance();
		Datastore database2 = Datastore.getInstance();
		database.add(7);
		database2.add(12123);

		System.out.println(database.get(0));
		System.out.println(database2.get(0));

	}

}
