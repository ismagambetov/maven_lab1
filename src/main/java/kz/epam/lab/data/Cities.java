package main.java.kz.epam.lab.data;

import java.util.HashMap;
import java.util.List;

import main.java.kz.epam.lab.tools.CreateList;

/**
 * @author Damir Ismagambetov
 * 
 * Class with method that create 
 * lists of city
 */
public class Cities {
	
	/**
	 * Filling lists
	 * @return list
	 */
	public static HashMap<String, List<String>> createList() {
		
		HashMap<String, List<String>> cities = new HashMap<>();
		
		cities.put("Иерусалим", CreateList.makeList("Shamai Suites", "The King David"));		
		cities.put("Эйлат", CreateList.makeList("Leonardo Plaza Hotel Eilat", "Isrotel Agamim", "U Coral Beach"));		
		cities.put("Хайфа", CreateList.makeList("Dan Panorama", "1926 Apartments Hotel"));				
		cities.put("Москва", CreateList.makeList("Новотель Москва Сити", "Рэдиссон Ройал", "Гостиница Салют", "Мери Голд Отель"));		
		cities.put("Новосибирск", CreateList.makeList("Marriott Hotel", "Отель Метелица"));		
		cities.put("Рим", CreateList.makeList("Lirico Hotel", "Amalfi Hotel"));		
		cities.put("Милан", CreateList.makeList("Armani Hotel Milano", "Enterprise Hotel"));		
		cities.put("Венеция", CreateList.makeList("Novotel Venezia Mestre", "Arlecchino Hotel", "Bauer Hotel"));		
		cities.put("Мадрид", CreateList.makeList("Axor Feria Hotel", "Hotel Villa Real", "Hotel Acta Madfor"));		
		cities.put("Барселона", CreateList.makeList("Astoria Hotel", "Hesperia Sant Joan"));		
		cities.put("Санья", CreateList.makeList("Resort Intime", "Banyan Tree"));
		cities.put("Шанхай", CreateList.makeList("Cachet Boutique", "New World Shanghai Hotel", "Grand Hyatt"));		
		cities.put("Адду атолл", CreateList.makeList("Canareef Resort Maldives", "Herathera Island Resort"));		
		cities.put("Раа", CreateList.makeList("Loama Resort Maldives at Maamigili", "Adaaran Select Meedhupparu"));		
		cities.put("Пхукет", CreateList.makeList("Le Meridien", "Pacific Club Resort", "Aspery Hotel"));		
		cities.put("Паттайя", CreateList.makeList("Bella Villa Prima Hotel", "Hilton Pattaya", "Red Planet Pattaya"));

		return cities;
		
		
		
	}

}
