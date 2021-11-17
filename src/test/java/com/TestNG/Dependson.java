package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dependson {
	
	//dependson method
	
	
		@Test 
		private void father() throws InterruptedException {
		
			System.out.println("daddy");

		}
		@Test(dependsOnMethods = "father")
		private void mother() {
			System.out.println("mummy");

		}
		@Test
		private void brother() {
			System.out.println("bro");

		}
		@Test (dependsOnMethods = "brother")
		private void sister() {
			System.out.println("sibli");

		}
	
	
	}



