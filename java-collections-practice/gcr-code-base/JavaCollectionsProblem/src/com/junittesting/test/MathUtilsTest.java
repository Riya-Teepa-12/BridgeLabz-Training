package com.junittesting.test;


import org.junit.Test;

import com.junittesting.com.MathUtils;


public class MathUtilsTest {
	 @Test(expected = ArithmeticException.class)
	    public void testDivideByZero() {
		 MathUtils.divide(10, 0);
	    }
	 
	
}
