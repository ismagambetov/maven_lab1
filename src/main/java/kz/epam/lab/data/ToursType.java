package main.java.kz.epam.lab.data;

import java.util.HashMap;
import java.util.List;

import main.java.kz.epam.lab.tools.CreateList;

/**
 * @author Damir Ismagambetov
 * 
 * Class with method that create 
 * lists of tours' types
 */
public class ToursType {
	
	/**
	 * Filling lists
	 * @return list
	 */
	public static HashMap<String, List<String>>  tours() {
		
		HashMap<String, List<String>> tours = new HashMap<>();
		
		tours.put("Exotic", CreateList.makeList("��������", "�������"));		
		tours.put("Medical", CreateList.makeList("������", "�������"));
		tours.put("Shopping", CreateList.makeList("������", "�������", "�����"));
		
		return tours;


		
	}

}
