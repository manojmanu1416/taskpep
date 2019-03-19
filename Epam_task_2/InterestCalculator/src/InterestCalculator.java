



/**
 * @author manoj
 *
 */
public class InterestCalculator {
	
	
	/**
	 * method to calculate simpleInterest
	 * @param principal is principal amount
	 * @param time is time period
	 * @param rateOfIntrest is interest in years
	 * @return
	 */
	public double calcSimpleInterest(float principal,float time, float rateOfInterest) {
		
		return principal*time*(rateOfInterest/100);
	}
	/**
	 * method to calculate CompoundInterest
	 * @param principal is principal amount
	 * @param time is time period
	 * @param rateOfIntrest is interest in years
	 * @return
	 */
	public double calcCompoundInterest(float principal,float time, float rateOfInterest) {
		
		return principal* Math.pow((1 + rateOfInterest/100),time);
	}
}
