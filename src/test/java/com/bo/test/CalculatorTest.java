package com.bo.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.bo.Calculator;

public class CalculatorTest {

	Calculator calculator;
	@Before
	public void setUp() throws Exception {
	calculator=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	int add=calculator.add(10,20);
	assertEquals(30,add);
	}

}
