package Student_System;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentSystem studentSystem = new StudentSystem();
		while (true) {
			String[] input = scanner.nextLine().split(" ");
			String command = input[0];
			
			if (command.equals("Exit")) {
				break;
			} else if (command.equals("Create")) {
				studentSystem.create(input);

			} else if (command.equals("Show")) {
				studentSystem.show(input);

			}
		}
		scanner.close();
	}

}
