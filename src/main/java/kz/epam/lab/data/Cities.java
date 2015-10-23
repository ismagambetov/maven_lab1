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
		
		cities.put("���������", CreateList.makeList("Shamai Suites", "The King David"));		
		cities.put("�����", CreateList.makeList("Leonardo Plaza Hotel Eilat", "Isrotel Agamim", "U Coral Beach"));		
		cities.put("�����", CreateList.makeList("Dan Panorama", "1926 Apartments Hotel"));				
		cities.put("������", CreateList.makeList("�������� ������ ����", "�������� �����", "��������� �����", "���� ���� �����"));		
		cities.put("�����������", CreateList.makeList("Marriott Hotel", "����� ��������"));		
		cities.put("���", CreateList.makeList("Lirico Hotel", "Amalfi Hotel"));		
		cities.put("�����", CreateList.makeList("Armani Hotel Milano", "Enterprise Hotel"));		
		cities.put("�������", CreateList.makeList("Novotel Venezia Mestre", "Arlecchino Hotel", "Bauer Hotel"));		
		cities.put("������", CreateList.makeList("Axor Feria Hotel", "Hotel Villa Real", "Hotel Acta Madfor"));		
		cities.put("���������", CreateList.makeList("Astoria Hotel", "Hesperia Sant Joan"));		
		cities.put("�����", CreateList.makeList("Resort Intime", "Banyan Tree"));
		cities.put("������", CreateList.makeList("Cachet Boutique", "New World Shanghai Hotel", "Grand Hyatt"));		
		cities.put("���� �����", CreateList.makeList("Canareef Resort Maldives", "Herathera Island Resort"));		
		cities.put("���", CreateList.makeList("Loama Resort Maldives at Maamigili", "Adaaran Select Meedhupparu"));		
		cities.put("������", CreateList.makeList("Le Meridien", "Pacific Club Resort", "Aspery Hotel"));		
		cities.put("�������", CreateList.makeList("Bella Villa Prima Hotel", "Hilton Pattaya", "Red Planet Pattaya"));

		return cities;
		
		
		
	}

}
