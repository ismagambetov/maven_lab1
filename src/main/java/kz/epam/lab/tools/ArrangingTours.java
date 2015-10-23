package main.java.kz.epam.lab.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import main.java.kz.epam.lab.data.Cities;
import main.java.kz.epam.lab.data.Countries;
import main.java.kz.epam.lab.data.FoodMode;
import main.java.kz.epam.lab.data.PricelistOfHotels;
import main.java.kz.epam.lab.data.StarsLevel;
import main.java.kz.epam.lab.data.ToursPricelist;
import main.java.kz.epam.lab.data.ToursType;
import main.java.kz.epam.lab.tour.Exotic;
import main.java.kz.epam.lab.tour.Medical;
import main.java.kz.epam.lab.tour.Shopping;
import main.java.kz.epam.lab.tour.Tour;

/**
 * @author Damir Ismagambetov
 * 
 * Arranging tours lists
 * Calling sort of tours 
 */
public class ArrangingTours {	
	
	private int numberOfPersons;
	private int star;
	private String foodMode;
	private int numberOfVacationDays;
	private int sum;
	
	/**
	 * Constructor with called parameters
	 * 
	 * @param numberOfPersons
	 * @param star
	 * @param foodMode
	 * @param numberOfVacationDays
	 * @param sum
	 */
	public ArrangingTours(int numberOfPersons, int star, String foodMode, int numberOfVacationDays, int sum) {
		this.numberOfPersons = numberOfPersons;
		this.star = star;
		this.foodMode = foodMode;
		this.numberOfVacationDays = numberOfVacationDays;
		this.sum = sum;
	}
	
    /**
    * Preparing tours lists by calling Builder() methods of tours' types class
    */
	public void prepareToursLists(List<Tour> allToursList, String tourName, String country, String city, String hotel, 
			int tourCost, int totalRentCost, int totalFoodCost, int totalSum) {		
		
		
		switch (tourName.toLowerCase()) {
		case "exotic":
			allToursList.addAll(
					Arrays.asList(Exotic.builder(country, city, hotel, tourCost, totalRentCost, 
							totalFoodCost, totalSum).build()));
			break; 
		case "medical":
			allToursList.addAll(
					Arrays.asList(Medical.builder(country, city, hotel, tourCost, totalRentCost, 
							totalFoodCost, totalSum).build()));
			break;
		case "shopping":
			allToursList.addAll(
					Arrays.asList(Shopping.builder(country, city, hotel, tourCost, totalRentCost, 
							totalFoodCost, totalSum).build()));
			break;

		default:
			break;
		}

	}
	
    /**
    * Methods where best variants of tours are selected 
    * by given parameters
    * and return prepared list filled tours  
    */
	public List<Tour> tours() {
		
		//--------------------------------------------------------------
		HashMap<String, Integer> hotelsByStar = selectHotelsListByStar();
		HashMap<String, Integer> toursPricelist = ToursPricelist.createList();
		int foodPercent = getPercent();
		
		PriceAnalysis analysis = new PriceAnalysis();
		List<Tour> allToursList = new ArrayList<>();
		//--------------------------------------------------------------
		HashMap<String, List<String>> toursType = ToursType.tours();
		HashMap<String, List<String>> countries = Countries.createList();
		HashMap<String, List<String>> cities = Cities.createList();
		
		for(Entry<String,List<String>> tour : toursType.entrySet()) {
			String tourName = tour.getKey();
			List<String> countriesByTour = tour.getValue();
			
			for (String country : countriesByTour) {
				List<String> citiesByCountries = (List<String>) countries.get(country);
			
				for (String city : citiesByCountries) {
					List<String> hotelsByCity = (List<String>) cities.get(city);
				
					for(String hotel : hotelsByCity) {
					
						//for(Entry<String,Integer> currentStr: hotelsByStar.entrySet()) {				
							boolean result = hotelsByStar.containsKey(hotel);	
							if (result == true) {
								//int apartmentCost = currentStr.getValue();
								int apartmentCost = hotelsByStar.get(hotel);
								int tourCost = toursPricelist.get(country);
							
								HashMap<String, Integer> paymentList = analysis.calculateAndPrepareList(tourCost, apartmentCost, 
										foodPercent, numberOfPersons, numberOfVacationDays, sum);
							
								if (!paymentList.isEmpty()) {
									int totalTourCost = paymentList.get("totalTourCost");
									int totalRentCost = paymentList.get("totalRentCost");
									int totalFoodCost = paymentList.get("totalFoodCost");
									int totalSum 	  = paymentList.get("totalSum");
									
									//calling method prepareToursLists()
									prepareToursLists(allToursList, tourName, country, city, hotel,totalTourCost,
											          totalRentCost,totalFoodCost,totalSum);						
								}							
							}							
						//}					
					}
				}
			}	
		}		
		return allToursList;
	}
	
    /**
    * Methods where selected all hotels  
    * by passed parameters "star"
    * and return prepared list filled hotels  
    */
	public HashMap<String, Integer> selectHotelsListByStar() {
		
		HashMap<Integer,List<String>> stars = StarsLevel.createList();
		HashMap<String, Integer> hotelsPricelist = PricelistOfHotels.createList();
		HashMap<String, Integer> selectedList = new HashMap<>();
		
		List<String> HotelsListByStarLevel = (List<String>) stars.get(star);
		
		for (String hotel : HotelsListByStarLevel) {
			
			for (Entry<String, Integer> currentStr : hotelsPricelist.entrySet()) {
				String strHotel = currentStr.getKey();
				int strCost = currentStr.getValue(); 
				
				if (hotel == strHotel) selectedList.put(hotel, strCost);
				
			}
		}			
		return selectedList;	
	}
	
    /**
    * Searching and returning pay percent for food in tours  
    */
	public int getPercent() {
		
		FoodMode mode = new FoodMode();
		int percent = 0;
		switch (foodMode.toUpperCase()) {
		case "RO":
			percent = mode.getRO();
			break;
		case "BB":
			percent = mode.getBB();
			break;		
		case "HB":
			percent = mode.getHB();
			break;
		case "FB":
			percent = mode.getFB();
			break;
		case "AL":
			percent = mode.getAL();
			break;
		default:
			percent = -1;
			break;
		}
		
		return percent;
	}
}
