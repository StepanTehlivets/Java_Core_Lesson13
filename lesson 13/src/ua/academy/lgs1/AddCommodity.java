package ua.academy.lgs1;

import java.util.Scanner;
import java.util.Set;

public class AddCommodity {
	public static void add(Set<Commodity> sl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter commodity name");
		String name = sc.next();
		System.out.println("Enter commodity width");
		Double width = sc.nextDouble();
		System.out.println("Enter commodity length");
		Double length = sc.nextDouble();
		System.out.println("Enter commodity weight");
		Double weight = sc.nextDouble();

		Commodity comm = new Commodity(name, width, length, weight);
		sl.add(comm);
		System.out.println("You added commodity " + comm + " to your list" + sl);

	}
}
