package Collection_Hierarchy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddCollection addColl = new AddCollection();
		AddRemoveCollection addRemColl = new AddRemoveCollection();
		MyListImpl myList = new MyListImpl();

		String[] input = sc.nextLine().split(" ");

		printAddResults(addColl, addRemColl, myList, input);
		int removeOperations = Integer.parseInt(sc.nextLine());
		printRemoveResults(addColl, addRemColl, myList, removeOperations);

		sc.close();

	}

	private static void printAddResults(AddCollection addColl, AddRemoveCollection addRemColl, MyListImpl myList,
			String[] input) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		for (int i = 0; i < input.length; i++) {
			sb1.append(addColl.add(input[i]) + " ");
			sb2.append(addRemColl.add(input[i]) + " ");
			sb3.append(myList.add(input[i]) + " ");
		}
		System.out.printf("%s%n%s%n%s%n", sb1, sb2, sb3);
	}

	private static void printRemoveResults(AddCollection addColl, AddRemoveCollection addRemColl, MyListImpl myList,
			int n) {
		StringBuilder sb2 = new StringBuilder();
		StringBuilder sb3 = new StringBuilder();

		for (int i = 0; i < n; i++) {

			sb2.append(addRemColl.remove() + " ");
			sb3.append(myList.remove() + " ");
		}
		System.out.printf("%s%n%s%n", sb2, sb3);
	}
}
