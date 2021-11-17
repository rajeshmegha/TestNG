package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.reflect.Parameter;

public class Parameterize_testng {
	
	@Test
	@Parameters("cities")
	private void city(String name) {
		
		
		System.out.println("my current city  is  "+name);
		
		

	}
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	/*String name = "Rhiya";
	@Test
	private void city() {
		
		System.out.println("my city is  "+name);

	}*/
	
	
	
	

}
