package com.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.junit.Calculator;
import com.junit.ICalculator;

public class CalculatorTest {
	private static ICalculator calculator;

	@BeforeClass // Once prior to execution of all test cases.
	public static void initCalculator() {
		calculator = new Calculator();
		System.out.println(" Hello ! Before Class");
	}

	@Before // Execute always prior to execution of every test case 
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}

	@After
	public void afterEachTest() {
		System.out.println("This is exceuted after each Test");
	}

	@Test // This is a test case
	public void testSum() {
		int result = calculator.sum(3, 4);
		//System.out.println("Hello");
		assertEquals(7, result);	
	}

	@Test
	public void testDivison() {
		try {
			int result = calculator.divison(10, 2);

			assertEquals(5, result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
	}

	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.divison(10,0);
	}

	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		assertTrue(result);
	}

	@Ignore
	@Test
	public void testSubstraction() {
		int result = 10 - 3;

		assertTrue(result == 9);
	}
}
