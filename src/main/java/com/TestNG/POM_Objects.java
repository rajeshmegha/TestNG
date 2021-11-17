package com.TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_Objects {
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	public static WebElement signin;
	
	@FindBy (id="email")
	public static WebElement username;
	
	@FindBy (id="passwd")
	public static WebElement password;
	
	@FindBy (id="SubmitLogin")
	public static WebElement login;
	
	@FindBy (xpath = "//a[@title='Women']")
	public static WebElement women;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/div[3]/div[2]/ul/li[4]/div/div[1]/div/a[1]/img")
	public static WebElement dressimg;
	
	@FindBy (xpath ="(//iframe[@class='fancybox-iframe'])[1]")
	public  static WebElement frame;
	
	@FindBy (xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	public static WebElement quantity;
	
	@FindBy (id="group_1")
	public static WebElement size;
	
	@FindBy (id="color_24")
   public static WebElement colour;
	
	@FindBy (xpath="//p[@id='add_to_cart']")
	public static WebElement add_to_cart;
	
	@FindBy (xpath = "//*[@title=\"Proceed to checkout\"]")
	public static WebElement proceed_checkout;
	
	
	@FindBy(xpath="//*[text()='Proceed to checkout']")
	public static WebElement summary;
	
	@FindBy (xpath  ="//button[@name='processAddress']")
	public static WebElement address;
	
     @FindBy (id = "cgv")
	public static WebElement checkbox;
	
	@FindBy (name = "processCarrier")
	public static WebElement process;
	
   @FindBy (xpath= "//a[@class='bankwire']")
    public static WebElement payment;
    
	@FindBy (xpath = "//*[contains (text(),'I confirm my order')]")
	public static WebElement order;
	
	
	
	
	
	
	
	
	
	
	
	
	


}
