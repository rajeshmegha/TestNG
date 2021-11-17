package com.TestNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


//Normal case for string compariosn
public class Assertion {
	@Test
	private void assert1() {
      String name ="RAJESH";
	 if (name.equals("Rajesh")) {
	System.out.println("condution passed");
	}
	else {
	System.out.println("condition failed");
	}}

//using Assert
//condition true bcz both r equal	
	
	@Test
	private void ASSERT1() {
		
		String name = "Rajesh";
		String name1 = "Rajesh";
		
		assertEquals(name, name1);
}
	//condition true
	@Test
	private void ASSERT2() {
		
		String name = "Rajesh";
		String name1 = "rajesh";
		
		assertNotNull(name, name1);
	}
		
 @Test
private void ASSERT3() {
	 
	 String name = "Rajesh";
	String name1 = "rajesh";
	
	SoftAssert s = new SoftAssert();
	s.assertEquals(name, name1);
	
	
	
	
	
	
	
	
		

}

}
