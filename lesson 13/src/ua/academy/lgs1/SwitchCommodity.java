package ua.academy.lgs1;

import java.util.Scanner;
import java.util.Set;

public class SwitchCommodity {
	public static void switchComm(Set<Commodity> sl) {
		System.out.println("Ënter data of commodity that need to be substituted");
		System.out.println("Enter commodity name");
		Scanner sc = new Scanner(System.in);
		String nameR = sc.next();
		System.out.println("Enter commodity width");
		Double widthR = sc.nextDouble();
		System.out.println("Enter commodity length");
		Double lengthR = sc.nextDouble();
		System.out.println("Enter commodity weight");
		Double weightR = sc.nextDouble();
		
		Commodity commR = new Commodity(nameR, widthR, lengthR, weightR);
		sl.remove(commR);
		System.out.println("Enter data of new commodity to be placed");
		
		System.out.println("Enter commodity name");
		String nameA = sc.next();
		System.out.println("Enter commodity width");
		Double widthA = sc.nextDouble();
		System.out.println("Enter commodity length");
		Double lengthA = sc.nextDouble();
		System.out.println("Enter commodity weight");
		Double weightA = sc.nextDouble();

		Commodity commA = new Commodity(nameA, widthA, lengthA, weightA);
		sl.add(commA);
		System.out.println("You substituted "+ commR + " with "+commA );
	}
}
