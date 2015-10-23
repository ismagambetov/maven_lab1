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
		
		countries.put("�������",  CreateList.makeList("���������", "�����", "�����"));		
		countries.put("������",   CreateList.makeList("������", "�����������"));
		countries.put("������",   CreateList.makeList("���", "�����", "�������"));		
		countries.put("�������",  CreateList.makeList("������", "���������"));		
		countries.put("�����",    CreateList.makeList("�����", "������"));		
		countries.put("��������", CreateList.makeList("���� �����", "���"));		
		countries.put("�������",  CreateList.makeList("������", "�������"));
		
		return countries;
	}

}
