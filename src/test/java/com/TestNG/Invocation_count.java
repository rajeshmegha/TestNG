package com.TestNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Invocation_count {
	
	
	@Test (priority = 2)
	private void AMAZON() {
	
		System.out.println("open amazon");
		
	}
	
	@Test  (enabled = false)
	private void MYNTRA() {
		
		System.out.println("open myntra");

	}
	
	@Test (timeOut = 1500)
	private void SNAPDEAL() throws InterruptedException {
		Thread.sleep(1200);
		System.out.println("open snapdeal");

	}
	
	@Test (invocationCount = 4)
	private void FLIPKART() {
		
		System.out.println("open flipkart");

	}
	@Test  @Ignore
	private void shopclues() {
		System.out.println("open shopclues");

	}

}
