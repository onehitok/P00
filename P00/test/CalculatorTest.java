import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testAdd() {
		int a = 4323;
		int b = 1234;
		
		//Testing
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5557;
		assertEquals (expected, actual);
		}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public final void testMultiple() {
		int a = 9;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		
		int expected = 90;
		assertEquals(actual, expected);
	}
	@Test
	public final void testDivide() {
		int a = 90;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		
		int expected = 9;
		assertEquals(actual, expected);
	}


}


