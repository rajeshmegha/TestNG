package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DD_USING_DATAPROVIDER {
	
	@DataProvider(name="instadatas")
	public String[][] Insta_login() {
		
		String [][] Insta_logdatas= {
				
				{"wu","wp"},
				{"9500032248","wp"},
				{"wu","rhiya228"},
				{"9500032248","rhiya228"}
		};

         return Insta_logdatas;
         
	}
         @Test (dataProvider = "instadatas")
          public void Instagram(String un,String pw) throws InterruptedException {
        	 
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SELINIUM_PROJECTS\\DRIVER\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
             driver.get("https://www.instagram.com/");
             
             WebElement username = driver.findElement(By.name("username"));
         	username.sendKeys(un);
         	
         	WebElement password = driver.findElement(By.name("password"));
        	password.sendKeys(pw);
        	
        	WebElement login = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        	login.click();
        	Thread.sleep(2000);

         }   
        
        }
	
