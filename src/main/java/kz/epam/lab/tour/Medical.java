package main.java.kz.epam.lab.tour;

/**
 * @author Damir Ismagambetov
 * 
 * Class extends common class Tour has extend redefined
 * constructor and Builder
 */
public final class Medical extends Tour {
	
	/**
	 * Extending constructor from class Tour with called parameters
	 * 
	 * @param tourName
	 * @param country           
	 * @param city
	 * @param hotel
	 * @param tourCost
	 * @param totalRentCost
	 * @param totalFoodCost
	 * @param totalSum 
	 */
	public Medical(String tourName, String country, String city, String hotel, int tourCost, int totalRentCost, 
			int totalFoodCost, int totalSum) {
		
		super(tourName, country, city, hotel, tourCost, totalRentCost, totalFoodCost, totalSum);
		
	}



	/**
	 * Builder return called parameters to constructor:
	 * 
	 * @param country           
	 * @param city
	 * @param hotel
	 * @param tourCost
	 * @param totalRentCost
	 * @param totalFoodCost
	 * @param totalSum 
	 */
	public static Medical builder(String country, String city, String hotel, int tourCost, int totalRentCost, 
			int totalFoodCost, int totalSum) {
		return new Medical("Лечебно-оздоровительный", country, city, hotel, tourCost, totalRentCost, totalFoodCost, totalSum);
	}

	public Medical build() {
		return Medical.this;
	}

}
