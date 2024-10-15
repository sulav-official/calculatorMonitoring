package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {

	SimpleCalculator calculator = new SimpleCalculator();

	@Test
	public void testAdd() {
		assertEquals(6, calculator.add(1, 2, 3));
	}

	@Test
	public void testSubtract() {
		assertEquals(0, calculator.subtract(3, 2, 1));
	}

	@Test
	public void testMultiply() {
		assertEquals(6, calculator.multiply(1, 2, 3));
	}

	@Test
	public void testDivide() {
		assertEquals(0.5, calculator.divide(1, 2, 1), 0.01);
	}

	@Test
	public void testDivideByZero() {
		assertThrows(IllegalArgumentException.class,
				() -> calculator.divide(1, 0, 1));
	}
}