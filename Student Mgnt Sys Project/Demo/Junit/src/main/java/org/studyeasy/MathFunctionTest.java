package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class MathFunctionTest {
	
	MathFunction mathFunctions = new MathFunction();

	@BeforeEach
	void beforeEach() {
		MathFunction mathFunctions = new MathFunction();
     }
	@AfterEach
	void afterEach() {
		System.out.println("Executed");
	}
	@Test
	@RepeatedTest(6)
	void testAdd() {
		
		/*System.out.println("Hello Jupitor");
		//fail("Not yet implemented");
		
		MathFunction mathFunctions = new MathFunction();
		int expected=40;
		int actual=mathFunctions.add(10,30);
		assertEquals(expected,actual);
		
		/*if(expected == actual) {
			System.out.println("passed");
		}else {
			fail("failed");
		}*/
	    //MathFunction mathFunctions = new MathFunction();
		int expected=40;
		int actual=mathFunctions.add(10,30);
		assertEquals(expected,actual,"Substraction operation failed");
	}
	@Test
	@RepeatedTest(6)

	void testSub() {
		//MathFunction mathFunctions = new MathFunction();
		int expected=40;
		int actual=mathFunctions.add(10,30);
		assertEquals(expected,actual,"Substraction operation failed");
	}
	@Test
	@RepeatedTest(6)
     void testMultiple() {
		//MathFunction mathFunctions = new MathFunction();
		int expected=40;
		int actual=mathFunctions.add(10,30);
		assertEquals(expected,actual,"Multiplication operation failed");
	}
	@Test
	@RepeatedTest(6)
	void testDivide() {
		//MathFunction mathFunctions = new MathFunction();
		int expected=40;
		int actual=mathFunctions.add(10,30);
		assertEquals(expected,actual,()->"Dividision operation failed");
		assertThrows(ArithmeticException.class, ()-> mathFunctions.divide(10,0), ()-> "ArithmeticException Expected");
	}
	
	}

