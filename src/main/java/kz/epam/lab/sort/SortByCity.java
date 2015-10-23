package main.java.kz.epam.lab.sort;

import java.util.Comparator;

import main.java.kz.epam.lab.tour.Tour;

/**
 * @author Damir Ismagambetov
 *
 * Sorting tours by parameter @city
 */
public final class SortByCity implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
		String city1 = o1.getCity();
		String city2 = o2.getCity();
		return city1.compareToIgnoreCase(city2);
	}
}


