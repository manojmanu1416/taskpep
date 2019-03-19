import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestCalculatorTester {

	@Test
	void calcSimpleInterest() {
		InterestCalculator Ic=new InterestCalculator();
		assertEquals(2000.0,Ic.calcSimpleInterest(20000, 2, 5));
		assertEquals(10000.0,Ic.calcSimpleInterest(20000, 5, 10));
	}
	@Test
	void calcCompoundInterest() {
		InterestCalculator Ic=new InterestCalculator();
		assertEquals(26620.001730918924,Ic.calcCompoundInterest(20000, 3, 10));
		assertEquals(25525.625454015066,Ic.calcCompoundInterest(20000, 5, 5));
	}

}
