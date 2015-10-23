package main.java.kz.epam.lab.persons;

import main.java.kz.epam.lab.tools.ArrangingTours;
import main.java.kz.epam.lab.tour.TourList;

/**
 * @author Damir Ismagambetov
 * 
 * Managing and gathering tours 
 * in common lists and
 * call a sorting method 
 */
public final class Manager {
	
	private int numberOfPersons;
	private int star;
	private String foodMode;
	private int numberOfVacationDays;
	private int sum;
	
	/**
	 * Constructor called parameters
	 * 
	 * @param numberOfPersons
	 * @param star           
	 * @param foodMode
	 * @param numberOfVacationDays
	 * @param sum
	 */
	public Manager(int numberOfPersons, int star, String foodMode, int numberOfVacationDays, int sum) {		
		this.numberOfPersons = numberOfPersons;
		this.star = star;
		this.foodMode = foodMode;
		this.numberOfVacationDays = numberOfVacationDays;
		this.sum = sum;
	}

    /**
    * Create tour list
    * with calling objects' collections
    */
	public TourList ÑreateTourList() {		
		TourList tourList = new TourList(); 
		ArrangingTours arranging = new ArrangingTours(numberOfPersons,star,foodMode,numberOfVacationDays,sum);
		
		tourList.add(arranging.tours());
		
		return tourList;
	}

    /**
    * Calling sort tours in tours' lists
    * by calling parameters:
    * 	
    * @param tourList
    * @param sortBy
    */
	public static void sortTours(TourList tourList, String sortBy) {
		TourList.sortTours(tourList, sortBy);
		System.out.println(tourList);
	}


}
