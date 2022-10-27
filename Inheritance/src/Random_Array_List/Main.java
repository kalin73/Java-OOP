package Random_Array_List;

public class Main {

	public static void main(String[] args) {
		RandomArrayList<Integer> arr = new RandomArrayList<>();
		arr.add(5);
		arr.add(3123);
		arr.add(234);
		arr.add(345);
		arr.add(1111);

		System.out.println(arr.getRandomElement());

	}

}
