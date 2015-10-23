package main.java.kz.epam.lab.tools;

/**
 * @author Damir Ismagambetov
 * 
 * Check costs for tour not to increase
 * value of parameters @sum 
 * if @sum > then method return true
 * and etc.
 */
public final class CheckPayAbility {
	
	int sum;
	int limitSum;
	
	/**
	 * Constructor CheckPayAbility with called parameters
	 * 
	 * @param sum
	 * @param limitSum 
	 */
	public CheckPayAbility(int sum, int limitSum) {		
		this.sum = sum;
		this.limitSum = limitSum;
	}
	
	/**
	 * The method that return true or false depending on condition 
	 * @return
	 */
	public boolean canPay() {		
		if (sum <= limitSum) {return true;} else {return false;}
	}
	
	

}
