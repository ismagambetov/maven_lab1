package main.java.kz.epam.lab.tools;

import java.util.HashMap;

/**
 * @author Damir Ismagambetov
 * 
 * The class calculates costs
 * Calling method for check sums  
 */
public final class PriceAnalysis {

	/**
	 * The method with called parameters
	 * 
	 * @param tourCost
	 * @param apartmentCost
	 * @param foodPercent
	 * @param numberOfPersons
	 * @param numberOfVacationDays
	 * @param limitSum
	 * @return
	 */
	public  HashMap<String, Integer> calculateAndPrepareList(int tourCost, int apartmentCost, int foodPercent, 
									 int numberOfPersons, int numberOfVacationDays, int limitSum) {
		
		int totalSum = 0;
		int totalTourCost = 0;
		int totalRentCost = 0; 
		int totalFoodCost = 0;		
		int sum = 0;
		
		
		sum = numberOfPersons * numberOfVacationDays;
		totalTourCost = sum * tourCost;
		totalRentCost = sum * apartmentCost;
		totalFoodCost = (int)Math.round(totalTourCost * foodPercent / 100);
		HashMap<String,Integer> list = new HashMap<>();
		
		totalSum = totalTourCost + totalRentCost + totalFoodCost;
		
		//creating object for calculated check sum
		CheckPayAbility result = new CheckPayAbility(totalSum, limitSum);		
		
		if (result.canPay()) {				
			list.put("totalTourCost", totalTourCost);
			list.put("totalRentCost", totalRentCost);
			list.put("totalFoodCost", totalFoodCost);
			list.put("totalSum", totalSum);
		}
		
		return list;
	}
	
}
