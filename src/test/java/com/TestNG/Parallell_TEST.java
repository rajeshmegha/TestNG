package com.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Parallell_TEST extends Baseclass {
	
	
	@Test(priority = 2)
	private void chrome_launch() throws IOException, InterruptedException {

		FileInputStream input_file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Maven_demo\\src\\main\\java\\com_Automation\\Maven_demo\\config.properties");
		Properties p = new Properties();
		p.load(input_file);
		String bw = p.getProperty("browser");
		String url = p.getProperty("url");
		String us = p.getProperty("username");
		String pw = p.getProperty("password");
		get_Browser(bw);
		getURL(url);
		implicit_wait();
		
		PageFactory.initElements(driver, POM_Objects.class);
		click_on_elememt(POM_Objects.signin);
		sleep();
		getinput(POM_Objects.username, us);
		getinput(POM_Objects.password, pw);
		click_on_elememt(POM_Objects.login);
		sleep();
	}

	@Test(priority = 1)
	private void firefox() throws IOException, InterruptedException {
		FileInputStream input_file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Maven_demo\\Hotel.properties");
		Properties pr = new Properties();
		pr.load(input_file);
		String bw = pr.getProperty("browser");
		String url = pr.getProperty("url");
		String us = pr.getProperty("username");
		String pw = pr.getProperty("password");
		get_Browser(bw);
		getURL(url);
		implicit_wait();
		
		PageFactory.initElements(driver, Mini_pj1_obj.class);
         getinput(Mini_pj1_obj.username, us);
		getinput(Mini_pj1_obj.passwrd, pw);
		click_on_elememt(Mini_pj1_obj.login);
		sleep();
	}

}



