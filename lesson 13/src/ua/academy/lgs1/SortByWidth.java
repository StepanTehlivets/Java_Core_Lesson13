package ua.academy.lgs1;

import java.util.Set;
import java.util.TreeSet;

public class SortByWidth {
	public static void sort(Set<Commodity> sl) {
		Set<Commodity> CommodityTreeSet = new TreeSet<Commodity>(new CommodityWidthComparator());
		CommodityTreeSet.addAll(sl);
		sl.clear();
		sl.addAll(CommodityTreeSet);
		System.out.println("Now your list looks like this " + sl);
	}
}
