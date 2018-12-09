package com.Utilities;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public abstract class ReadAndExcelSheet extends BasePage {
 public BasePage page =new BasePage();
 
	@BeforeMethod
	public void CreatingExcelSheet() throws IOException
	{
		
		
		System.out.println("Excel Readed successfully");
				
	}
	
	@Test
	public void  ReadingExcelSheet()
	{
		page.launchUrl();
	}
	
	@AfterMethod
	public void WritingExcelSheet()
	{
		page.closeUrl();
	}

}
