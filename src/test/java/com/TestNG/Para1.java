package com.TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para1 {
	
	@Test
	@Parameters("animals")
	private void pm(String name) {
		
		System.out.println("my pet is  "+ name);

	}
	
	

}
