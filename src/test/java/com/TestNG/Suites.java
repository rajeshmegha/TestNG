package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suites {
	
	WebDriver driver;
	
	@BeforeSuite
	private void browserlaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SELINIUM_PROJECTS\\DRIVER\\chromedriver.exe");
     driver = new ChromeDriver();
       }
	
	@Test (priority = 5)
	private void yahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@Test (priority = 1)
	private void amazon() {
		driver.get("https://www.amazon.in");
		}
	
	@Test (priority = 2)
	private void flipkart() {
		driver.get("https://www.flipkart.com");
	}
		
	@Test	(priority = 4)
	private void myntra() {
		driver.get("https://www.myntra.in");

   }
   @Test (priority = 3)
   private void ajio() {
	   driver.get("https://www.ajio.com");
}
   @AfterSuite
   private void browser_close() {
	   driver.close();

}
 }