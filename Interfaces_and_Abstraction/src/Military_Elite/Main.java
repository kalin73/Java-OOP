package Military_Elite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		List<PrivateImpl> privates = new ArrayList<>();

		while (!"End".equals(input[0])) {
			String command = input[0];
			try {
				switch (command) {
				case "Private":
					addPrivate(privates, input);
					break;

				case "LieutenantGeneral":
					addLieutenantGeneral(privates, input);
					break;

				case "Engineer":
					addEngineer(input);
					break;

				case "Commando":
					addCommando(input);
					break;

				case "Spy":
					addSpy(input);
					break;
				}

			} catch (IllegalArgumentException e) {
				
			}
			input = sc.nextLine().split(" ");
		}
		sc.close();
	}

	private static void addPrivate(List<PrivateImpl> privates, String[] inp) {
		int id = Integer.parseInt(inp[1]);
		String firstName = inp[2];
		String lastName = inp[3];
		double salary = Double.parseDouble(inp[4]);
		PrivateImpl prv = new PrivateImpl(id, firstName, lastName, salary);
		System.out.println(prv);
		privates.add(prv);

	}

	private static void addLieutenantGeneral(List<PrivateImpl> privates, String[] inp) {
		int id = Integer.parseInt(inp[1]);
		String firstName = inp[2];
		String lastName = inp[3];
		double salary = Double.parseDouble(inp[4]);
		LieutenantGeneralImpl lieutenant = new LieutenantGeneralImpl(id, firstName, lastName, salary);

		if (inp.length > 4) {
			for (int i = 5; i < inp.length; i++) {
				int privateId = Integer.parseInt(inp[i]);

				for (PrivateImpl p : privates) {
					if (p.getId() == privateId) {
						lieutenant.addPrivate(p);
						break;
					}
				}
			}

		}
		lieutenant.sort();

		System.out.println(lieutenant);
		System.out.println("Privates:");

		for (PrivateImpl p : lieutenant.getPirvates()) {
			System.out.println("  " + p);
		}

	}

	private static void addCommando(String[] inp) {
		int id = Integer.parseInt(inp[1]);
		String firstName = inp[2];
		String lastName = inp[3];
		double salary = Double.parseDouble(inp[4]);
		String corps = inp[5];
		CommandoImpl commando = new CommandoImpl(id, firstName, lastName, salary, corps);

		if (inp.length > 5) {
			for (int i = 6; i < inp.length; i += 2) {
				String codeName = inp[i];
				String state = inp[i + 1];
				commando.addMission(new Mission(codeName, state));
			}
		}
		System.out.println(commando);
		System.out.println("Missions:");

		for (Mission m : commando.getMissions()) {
			System.out.println("  " + m);
		}
	}

	private static void addEngineer(String[] inp) {
		int id = Integer.parseInt(inp[1]);
		String firstName = inp[2];
		String lastName = inp[3];
		double salary = Double.parseDouble(inp[4]);
		String corps = inp[5];
		EngineerImpl engineer = new EngineerImpl(id, firstName, lastName, salary, corps);

		if (inp.length > 5) {
			for (int i = 6; i < inp.length; i += 2) {
				String partName = inp[i];
				int hoursWorked = Integer.parseInt(inp[i + 1]);
				engineer.addRepair(new Repair(partName, hoursWorked));
			}
		}
		System.out.println(engineer);
		System.out.println("Repairs:");

		for (Repair r : engineer.getRepairs()) {
			System.out.println(r);
		}
	}

	private static void addSpy(String[] inp) {
		int id = Integer.parseInt(inp[1]);
		String firstName = inp[2];
		String lastName = inp[3];
		String codeNumber = inp[4];

		SpyImpl spy = new SpyImpl(id, firstName, lastName, codeNumber);
		System.out.println(spy);
	}

}
