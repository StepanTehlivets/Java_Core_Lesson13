package ua.academy.lgs1;

import java.util.Set;
import java.util.TreeSet;

public class SortByWeight {
	public static void sort(Set<Commodity> sl) {
		Set<Commodity> CommodityTreeSet = new TreeSet<Commodity>(new CommodityWeightComparator());
		CommodityTreeSet.addAll(sl);
		sl.clear();
		sl.addAll(CommodityTreeSet);
		System.out.println("Now your list looks like this " + sl);
	}
}
