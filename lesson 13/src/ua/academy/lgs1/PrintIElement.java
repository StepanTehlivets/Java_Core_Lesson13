package ua.academy.lgs1;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class PrintIElement {
public static void printI(Set<Commodity> sl){
	System.out.println("Enter number of element you want to print(range from 0 to " +(sl.size()-1) + ")");
	Scanner sc = new Scanner (System.in);
	int element = sc.nextInt();
	LinkedList<Commodity> ll = new LinkedList<>();
	ll.addAll(sl);
	System.out.println(ll.get(element));
	}
	
}

