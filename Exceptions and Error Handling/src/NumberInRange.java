import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] range = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		int start = range[0];
		int end = range[1];
		System.out.printf("Range: [%d...%d]%n", start, end);
		boolean isValid = false;

		while (!isValid) {
			String number = sc.nextLine();
			Optional<Integer> numb = Optional.empty();

			try {
				numb = Optional.of(Integer.parseInt(number));

			} catch (NumberFormatException ignored) {
			}

			String outPut = "Invalid number: " + number;

			if (numb.isPresent() && numb.get() <= end && numb.get() >= start) {
				outPut = "Valid number: " + numb.get();
				isValid = true;
			}
			
			System.out.println(outPut);
		
		}
		sc.close();
	}

}
