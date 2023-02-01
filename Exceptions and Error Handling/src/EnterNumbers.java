import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EnterNumbers {
	static int highestNumber = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		while (list.size() < 10) {

			try {
				int number = readNumber(sc, 1, 100);
				list.add(number);

			} catch (NumberFormatException e) {
				System.out.println("Invalid Number!");

			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		String result = list.stream().map(String::valueOf).collect(Collectors.joining(", "));
		System.out.println(result);

	}

	public static int readNumber(Scanner sc, int start, int end) {
		int number = 0;

		number = Integer.parseInt(sc.nextLine());

		if (!(number > highestNumber && number < 100 && number > 1)) {
			throw new IllegalArgumentException(String.format("Your number is not in range %d - 100!", highestNumber));
		}
		highestNumber = number;
		return number;
	}
}
