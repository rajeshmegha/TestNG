package com.TestNG;

import org.testng.annotations.Test;

public class Timeout {
	
	
	@Test (timeOut = 2100)
	private void amazon() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("open amazon");

	}
	@Test (timeOut = 1500)
	private void flipkart() throws InterruptedException {

      Thread.sleep(2000);
		System.out.println("open flipkart");
	}
	

}
