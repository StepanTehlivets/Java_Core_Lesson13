package ua.academy.lgs1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
	public static void main(String[] args) {
		Set<Commodity> CommodityList = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Menu.menu();
			switch (sc.nextInt()) {
			case 1: {
				AddCommodity.add(CommodityList);
				break;
			}
			case 2: {
				DeleteCommodity.delete(CommodityList);
				break;
			}
			case 3: {
				SwitchCommodity.switchComm(CommodityList);
				break;
			}
			case 4: {
				SortByName.sort(CommodityList);
				break;
			}
			case 5: {
				SortByLength.sort(CommodityList);
				break;
			}
			case 6: {
				SortByWidth.sort(CommodityList);
				break;
			}
			case 7: {
				SortByWeight.sort(CommodityList);
				break;
			}
			case 8: {
				PrintIElement.printI(CommodityList);
				break;
			}
			case 9: {
				System.exit(0);
				break;
			}

			}

		}

	}
}
