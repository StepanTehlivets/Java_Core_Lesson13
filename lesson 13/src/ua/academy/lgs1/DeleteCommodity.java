package ua.academy.lgs1;

import java.util.Scanner;
import java.util.Set;

public class DeleteCommodity {
	public static void delete(Set<Commodity> sl) {
		System.out.println("Enter commodity name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Enter commodity width");
		Double width = sc.nextDouble();
		System.out.println("Enter commodity length");
		Double length = sc.nextDouble();
		System.out.println("Enter commodity weight");
		Double weight = sc.nextDouble();
		
		Commodity comm = new Commodity(name, width, length, weight);
		sl.remove(comm);
		System.out.println("You removed commodity " + comm + " from your list" + sl);
		
	}
}
