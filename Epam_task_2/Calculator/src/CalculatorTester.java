import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTester {

	@Test
	void testaddition() {
		Calculator c=new Calculator();
		assertEquals(10,c.add(4, 6));
		assertEquals(11,c.add(10, 2, -1));
		assertEquals(30,c.add(10, 20));
	}
	@Test
	void testmultiply() {
		Calculator c=new Calculator();
		assertEquals(24,c.multiply(4, 6));
		assertEquals(-20,c.multiply(10, 2, -1));
		assertEquals(200,c.multiply(10, 20));
	}
	@Test
	void testsubtract() {
		Calculator c=new Calculator();
		assertEquals(-2,c.subtract(4, 6));
		assertEquals(8,c.subtract(10, 2));
		assertEquals(-10,c.subtract(10, 20));
	}
	@Test
	void testdivision() {
		Calculator c=new Calculator();
		assertEquals(2,c.divis(4, 2));
		assertEquals(5,c.divis(10, 2));
		assertEquals(0,c.divis(10, 20));
	}
}
