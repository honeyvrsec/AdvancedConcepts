package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public Properties Prop;
    private  WebDriver driver;
    FileInputStream excelpath=null;
	public void  PropertiesPath() throws IOException,FileNotFoundException{
		Properties Prop = new Properties();
		FileInputStream ip = new FileInputStream(
				"C:\\Users\\91949\\eclipse-workspace\\AdvancedConcepts\\Config.Properties");
		Prop.load(ip);
		System.out.println(Prop.get("ExcelSheetPath"));
		FileInputStream excelpath = new FileInputStream(Prop.getProperty("ExcelSheetPath"));
		XSSFWorkbook workbook=new XSSFWorkbook(excelpath);
		Sheet sh=workbook.getSheetAt(0);
		System.out.println(sh.getRow(0).getCell(0));
		System.out.println(sh.getRow(0).getCell(1));

	}
	public void launchUrl() 
	{
		System.setProperty("webdriver.chrome.driver", "\\Users\\91949\\Downloads\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	}
	
	public void closeUrl()
	{
		driver.close();
	}
}
