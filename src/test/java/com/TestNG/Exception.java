package com.TestNG;

import org.testng.annotations.Test;

public class Exception {
	
	
/*@Test (expectedExceptions = NullPointerException.class)
	private void string() {
		
		String name = null;
		
		System.out.println(name.length());

	
	
	
}*/
	@Test (expectedExceptions = ArithmeticException.class)
	private void maths() {
		
		int a = 78;
		
		System.out.println(a/0);

	}

}
