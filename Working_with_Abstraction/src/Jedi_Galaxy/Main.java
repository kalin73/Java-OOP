package Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = dimestions[0];
		int y = dimestions[1];

		int[][] galaxy = createGalaxy(x, y);

		String command = scanner.nextLine();
		long sum = 0;
		while (!command.equals("Let the Force be with you")) {

			destroyingStars(scanner, galaxy);
			sum = collectingStars(command, scanner, galaxy, sum);

			command = scanner.nextLine();
		}

		System.out.println(sum);

	}

	public static int[][] createGalaxy(int x, int y) {
		int[][] matrix = new int[x][y];

		int value = 0;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				matrix[i][j] = value++;
			}
		}
		return matrix;
	}

	public static void destroyingStars(Scanner scanner, int[][] galaxy) {
		int[] evil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int xE = evil[0];
		int yE = evil[1];

		while (xE >= 0 && yE >= 0) {
			if (xE >= 0 && xE < galaxy.length && yE >= 0 && yE < galaxy[0].length) {
				galaxy[xE][yE] = 0;
			}
			xE--;
			yE--;
		}
	}

	public static long collectingStars(String command, Scanner scanner, int[][] galaxy, long sum) {
		int[] peter = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
		int xP = peter[0];
		int yP = peter[1];

		while (xP >= 0 && yP < galaxy[1].length) {
			if (xP >= 0 && xP < galaxy.length && yP >= 0 && yP < galaxy[0].length) {
				sum += galaxy[xP][yP];
			}

			yP++;
			xP--;
		}
		return sum;

	}

}
