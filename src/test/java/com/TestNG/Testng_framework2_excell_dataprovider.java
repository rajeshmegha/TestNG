package com.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng_framework2_excell_dataprovider {
	
	String[][] datas = null;
	
	@DataProvider(name="logindetails")
	public String[][] logindatas() {
		
		return datas;
    }
	
	
	public void getexceldatas() throws IOException {
		
	File f = new File("C:\\Users\\Admin\\Desktop\\Testng_datadriven -fb login.xlsx");
	FileInputStream fis = new FileInputStream(f) ;
	Workbook wk = new XSSFWorkbook(fis);
	Sheet sht = wk.getSheetAt(0);
	int no_of_rows = sht.getPhysicalNumberOfRows();
		
		System.out.println("the no of rows   :   "  +  no_of_rows);
		
		for (int i = 0; i < no_of_rows; i++) {
			Row row = sht.getRow(i);
			int pnc_Cells = row.getPhysicalNumberOfCells();
			
			
			for (int j = 0; j < pnc_Cells; j++) {
		     Cell cell = row.getCell(j);
		     CellType cellType = cell.getCellType();
		     
		    if (cellType.equals(CellType.STRING)){
		    	String stringCellValue = cell.getStringCellValue();
		    	System.out.print(stringCellValue + "      ");
		    }
		    else if (cellType.equals(CellType.NUMERIC)) {
		    	
		    	double numericCellValue = cell.getNumericCellValue();
		    	long val = (long) numericCellValue;
		    	System.out.print(val  +"    ");
				}
			}
		}
	}
	
	
	  @Test (dataProvider ="logindetails")
	   public void facebook(String un,String pw) throws InterruptedException {
		
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
