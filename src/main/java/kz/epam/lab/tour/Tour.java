package main.java.kz.epam.lab.tour;

/**
 * 
 * @author  
 * 
 * Parent abstract class "Tour" 
 * Contains 8 parameters for  all types of tours classes
 * 
 * @tourName
 * @country
 * @city
 * @hotel
 * @tourCost
 * @totalRentCost
 * @totalFoodCost
 * @totalCost
 */
public abstract class Tour {
	private String tourName;
	private String country;
	private String city;
	private String hotel;	
	private int tourCost;
	private int totalRentCost;
	private int totalFoodCost;
	private int totalCost;

	// Constructor for parameters of class Tour
	public Tour(String tourName, String country, String city, String hotel, int tourCost, int totalRentCost, 
			int totalFoodCost, int totalCost) {
		
		this.tourName = tourName;
		this.country = country;
		this.city = city;
		this.hotel = hotel;
		this.tourCost = tourCost;
		this.totalRentCost = totalRentCost;
		this.totalFoodCost = totalFoodCost;
		this.totalCost = totalCost;
	}
	
	public String getTourName() {
		return tourName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getHotel() {
		return hotel;
	}
	
	public int getTotalFoodCost() {
		return totalFoodCost;
	}
	
	public int getTotalRentCost() {
		return totalRentCost;
	}
	
	public int getTotalCost() {
		return totalCost;
	}
	
	public int getTourCost() {
		return tourCost;
	}



	@Override
	public String toString() {
		return "\n" + tourName+ "\n" +
				"Страна: "+ country + "\n" +
				"Город: "+ city + "\n" +
				"Отель: " + hotel + "\n" +
				"Расшифровка стоимости путевки: \n" +
				"Тур: " + tourCost + ", проживание: " + totalRentCost+ ", питания: " + totalFoodCost + "\n" +
				"Итого: " + totalCost + "\n" +
				"--------------------------------------------------------------------------------------------";
	}

}
