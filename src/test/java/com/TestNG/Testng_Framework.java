package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_Framework {
	
	//WebDriver driver;
	
	@Test
	@Parameters ({"usrname","paswrd"})
	private void facebook(String un,String pw) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SELINIUM_PROJECTS\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys(un);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(pw);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);
		
				
	
		
		
		
		

	}
	

}
