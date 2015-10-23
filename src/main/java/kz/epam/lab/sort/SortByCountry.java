package main.java.kz.epam.lab.sort;

import java.util.Comparator;

import main.java.kz.epam.lab.tour.Tour;

/**
 * @author Damir Ismagambetov
 *
 * Sorting tours by parameter @country
 */
public final class SortByCountry implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		String country1 = o1.getCountry();
		String country2 = o2.getCountry();
		return country1.compareToIgnoreCase(country2);
	}
}


