package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Groupings {
	
	@Test (priority = 3)
	private void Dhoni() {
		
		System.out.println("cricketer");
}
	@Test (groups = "fail")
	private void Rogerfederar() {
		
		System.out.println("tennies");

}
	@Test (enabled = false)
	private void levishamilton() {
     
		System.out.println("formula1");
}
	@Test @Ignore
	private void Hussainbolt() {

		System.out.println("athlet");
}
	@Test (priority = -1)
   private void christinaronaldo() {
		
		System.out.println("soccer");

}   
	@Test (groups = "fail")
	private void Tigerwoods() {
		
		System.out.println("golf");

}   @Test (priority = 0)
	private void paulwalker() {
		
		System.out.println("actor");

	}
	
	}
