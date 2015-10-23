package main.java.kz.epam.lab.sort;

import java.util.Comparator;

import main.java.kz.epam.lab.tour.Tour;

/**
 * @author Damir Ismagambetov
 *
 * Sorting tours by parameter @cost
 */
public final class SortByCost implements Comparator<Tour> {

	@Override
	public int compare(Tour o1, Tour o2) {
	    if (o1.getTotalCost() < o2.getTotalCost())
	        return -1;
	    else if (o1.getTotalCost() > o2.getTotalCost())
	        return 1;
	    else return 0;
	}
}
