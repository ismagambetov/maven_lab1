package main.java.kz.epam.lab.tourAgency;

import main.java.kz.epam.lab.persons.Manager;
import main.java.kz.epam.lab.tour.TourList;

/**
 * Created by Damir Ismagambetov
 * 
 * Task: Tour Agency
 * @author Damir Ismagambetov
 *
 */
public class Main {
	
	/**
     * Application starting point.
     *
     * @param args input arguments array
     */
	public static void main(String[] args) {		
		Manager manager = new Manager(2,5,"AL",14,5000);		
		TourList tourList = manager.ÑreateTourList();
		
		Manager.sortTours(tourList, "country");	
	}
}
