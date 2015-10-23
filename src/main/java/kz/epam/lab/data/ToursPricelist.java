package main.java.kz.epam.lab.data;

import java.util.HashMap;

/**
 * @author Damir Ismagambetov
 * 
 * Class with method that create 
 * lists of ToursPricelist
 */
public class ToursPricelist {
	
	/**
	 * Filling lists
	 * @return list
	 */
	public static HashMap<String, Integer> createList() {
		
		HashMap<String, Integer> pricelist = new HashMap<>();
		
		pricelist.put("Израиль",  74);		
		pricelist.put("Россия",   75);
		pricelist.put("Италия",   55);		
		pricelist.put("Испания",  40);		
		pricelist.put("Китай",    50);		
		pricelist.put("Мальдивы", 70);		
		pricelist.put("Тайланд",  74);
		
		return pricelist;
	}

}
