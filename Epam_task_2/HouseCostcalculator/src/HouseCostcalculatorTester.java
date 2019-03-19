import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HouseCostcalculatorTester {

	@Test
	void testCost() {
		HouseCostcalculator h;
		h= new HouseCostcalculator(1, 1704, false);
		assertEquals(2556000.0, h.Cost());
		h = new HouseCostcalculator(0, 123.7, false);
		assertEquals(148440.0, h.Cost());
		h = new HouseCostcalculator(2, 7654, true);
		assertEquals(1.9135E7, h.Cost());
	}

}
