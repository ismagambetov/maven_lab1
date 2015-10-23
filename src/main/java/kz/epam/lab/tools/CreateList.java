package main.java.kz.epam.lab.tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Damir Ismagambetov
 * 
 * Class create collection Lists
 */
public final class CreateList {
	
	/**
 	 * Making list which if filled by parameters
	 * @params
	 * @list
	 */
	public static List<String> makeList(String...params) {
		
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(params));
		return list;		
	} 

}