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
		
		pricelist.put("�������",  74);		
		pricelist.put("������",   75);
		pricelist.put("������",   55);		
		pricelist.put("�������",  40);		
		pricelist.put("�����",    50);		
		pricelist.put("��������", 70);		
		pricelist.put("�������",  74);
		
		return pricelist;
	}

}
