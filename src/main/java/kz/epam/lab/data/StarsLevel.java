package main.java.kz.epam.lab.data;

import java.util.HashMap;
import java.util.List;

import main.java.kz.epam.lab.tools.CreateList;

/**
 * @author Damir Ismagambetov
 * 
 * Class with method that create 
 * lists of stars level for each hotels
 */
public class StarsLevel {
	
	/**
	 * Filling lists
	 * @return list
	 */
	public static HashMap<Integer, List<String>> createList() {
		
		HashMap<Integer, List<String>> stars = new HashMap<>();
		
		stars.put(2, CreateList.makeList("Shamai Suites","U Coral Beach","Рэдиссон Ройал","Lirico Hotel",
											"Novotel Venezia Mestre","Hotel Villa Real","Resort Intime","Grand Hyatt",
											"Adaaran Select Meedhupparu"));
		
		stars.put(3, CreateList.makeList("The King David","Dan Panorama","Гостиница Салют","Amalfi Hotel",
											"Arlecchino Hotel","Hotel Acta Madfor","Banyan Tree","Canareef Resort Maldives",
											"Le Meridien","Red Planet Pattaya"));
		
		stars.put(4, CreateList.makeList("Leonardo Plaza Hotel Eilat","1926 Apartments Hotel","Marriott Hotel",
											"Armani Hotel Milano","Bauer Hotel","Astoria Hotel","Cachet Boutique",
											"Herathera Island Resort","Pacific Club Resort","Hilton Pattaya"));
		
		stars.put(5, CreateList.makeList("Isrotel Agamim","Новотель Москва Сити","Отель Метелица","Enterprise Hotel",
											"Axor Feria Hotel","Hesperia Sant Joan","New World Shanghai Hotel",
											"Loama Resort Maldives at Maamigili","Aspery Hotel","Bella Villa Prima Hotel",
													"Мери Голд Отель"));
		return stars;
		
	}

}
