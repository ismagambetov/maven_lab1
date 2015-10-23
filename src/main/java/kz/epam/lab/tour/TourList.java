package main.java.kz.epam.lab.tour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.java.kz.epam.lab.sort.SortByCity;
import main.java.kz.epam.lab.sort.SortByCost;
import main.java.kz.epam.lab.sort.SortByCountry;


/**
 * @author Damir Ismagambetov
 * 
 * Contains lists for filling by collections of tours
 * Also has methods calling  sorting method
 */
public final class TourList {

	private List<Tour> tourList = new ArrayList<Tour>();

	//public TourList() { //for what?
	//	tourList = new ArrayList<>();
//	}

	/**
	 * Adding collections of tours in tourList
	 * 
	 * @param listOfTours
	 */
	public void add(List<Tour> listOfTours) {
		for (Tour tour : listOfTours) {
			tourList.add(tour);
		}
	}
	
    
    /**
     * Depending on selected sort type it calls method of sorts
     */
    public static void sortTours(TourList obj, String sortBy) {
        switch (sortBy.toLowerCase()) {
            case "country":
                obj.sort(new SortByCountry());
                break;
            case "city":
                obj.sort(new SortByCity());
                break;
            case "cost":
                obj.sort(new SortByCost());
                break;    
            default:
                System.out.println("The method of sort does not found!");
                break;
        }
    }
    
    
	 /**
     * Calling  a sorting
     * 
     * @param comp - get a Comparator that collects in package "sort".
     */
    private void sort(Comparator<Tour> comp) {
		Collections.sort(tourList, comp);
	}	

	@Override
	public String toString() {
		return tourList + "";
	}
}
