
public class HouseCostcalculator {
	int material;
	double area;
	boolean isAutomated;
	
	/**
	 * constructor for the HouseCostcalculator class 
	 * job is to initialize class data
	 * @param material is material type
	 * @param area is area of house
	 * @param isAutomated
	 */
	public HouseCostcalculator(int material,double area,boolean isAutomated) {
		this.area=area;
		this.material=material;
		this.isAutomated=isAutomated;
	}
	
	/**
	 * method to calculate the cost of the house
	 * @return double cost of the house
	 */
	public double Cost() {
		int cost = 0;
		if(material==0)
			cost = 1200;
		else if(material==1)
			cost = 1500;
		else if(material==2 && isAutomated)
			cost = 2500;
		else
			cost = 1800;
		return area*cost;
	}
}
