package main.java.kz.epam.lab.data;

import java.util.HashMap;
import java.util.List;

import main.java.kz.epam.lab.tools.CreateList;

/**
 * @author Damir Ismagambetov
 * 
 * Class with method that create 
 * lists of country
 */
public class Countries {
	
	/**
	 * Filling lists
	 * @return list
	 */
	public static HashMap<String, List<String>> createList() {
		
		HashMap<String, List<String>> countries = new HashMap<>();
		
		countries.put("Израиль",  CreateList.makeList("Иерусалим", "Эйлат", "Хайфа"));		
		countries.put("Россия",   CreateList.makeList("Москва", "Новосибирск"));
		countries.put("Италия",   CreateList.makeList("Рим", "Милан", "Венеция"));		
		countries.put("Испания",  CreateList.makeList("Мадрид", "Барселона"));		
		countries.put("Китай",    CreateList.makeList("Санья", "Шанхай"));		
		countries.put("Мальдивы", CreateList.makeList("Адду атолл", "Раа"));		
		countries.put("Тайланд",  CreateList.makeList("Пхукет", "Паттайя"));
		
		return countries;
	}

}
