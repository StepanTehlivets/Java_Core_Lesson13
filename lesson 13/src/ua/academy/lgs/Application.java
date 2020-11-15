package ua.academy.lgs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {
	public static void main(String[] args) {
		Set<Game> listOfGames = new LinkedHashSet<>();

		listOfGames.add(new Game("GTA 3", 2002));
		listOfGames.add(new Game("Fallout 3", 2007));
		listOfGames.add(new Game("The Sims 4", 2013));
		listOfGames.add(new Game("Fifa 14", 2014));
		listOfGames.add(new Game("The Sims 3", 2008));
		listOfGames.add(new Game("Fallout 2", 2000));
		listOfGames.add(new Game("The Sims 2", 2004));
		listOfGames.add(new Game("The Sims 1", 2001));
		listOfGames.add(new Game("DAO", 2016));
		
		for (Game game : listOfGames) {
			System.out.println(game);
		}
		System.out.println("");
		TreeSet<Game> listOfGames1 = new TreeSet<>();
		listOfGames1.addAll(listOfGames);
		for (Game game : listOfGames1) {
			System.out.println(game);
		}
		System.out.println("");
		TreeSet<Game> listOfGames2 = new TreeSet<>(new GameNameComparator());
		listOfGames2.addAll(listOfGames);
		for (Game game : listOfGames2) {
			System.out.println(game);
		}
		
	}
}
