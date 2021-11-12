package com.contact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclass;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.FileUtility;
import com.Vtiger.Generic.IAutoConst;
import com.Vtiger.Generic.WebDriverUtility;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.HomePage;
import com.Vtiger.ObjectRepo.LoginPage;

public class Tc_003_CreateContact_StartDate_Test extends Baseclass
{
    
    @Test
	public void Tc003_CreateContactwithStartDate() throws Throwable
	{
		 ExcelUtility Elib= new ExcelUtility();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
		 HomePage hp =new HomePage(driver);
	     hp.getContactslink().click();
			
	     ContactInfopage cip= new ContactInfopage(driver);
	     cip.createcont();  
		
		
		//selecting first name in dropdown
				String abc1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 4, "Sheet1");
				CreateNewContactPage cnp= new CreateNewContactPage(driver);
				cnp.firstdropdown(abc1);
				
		//Entering the lastname
				String b1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,3, 0, "Sheet1");
				cnp.lastname().sendKeys(b1);
				
				//clicking the dropdown of leadsource
				String b2 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,3, 1, "Sheet1");
				cnp.seconddropdown(b2);
				
				//Entering data in Home mobile
				String b3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,3, 2, "Sheet1");
				cnp.otherphone().sendKeys(b3);
				
				//click on Do not call checkbox
				cnp.donotcall().click();
	 
				 //scrolldown
				
				WebElement element= cnp.portal();
				Point loc= element.getLocation();
				WebDriverUtility wutil= new WebDriverUtility();
				wutil.scrolldown(driver, loc);
	
	
				//Selecting Date                             //b1
				//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Calendar.gif']")).click();
				//Date not inspecting
				
				//clicking on save button
		           cnp.getSavecontbtn().click();
		           
		   		//Again clicking on Contacts
		   		 hp.getContactslink().click();		
		         //sending data in text boz
		   		 cip.contactname().sendKeys(b1);
		   	   //selecting the dropdowntype
		   		String abc3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 6, "Sheet1");
		   	    cip.selectdropdown(abc3);
	          //click on submit button
		   	    cip.submit();

		   		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + b1+ "']"));

		   		if (contactname.isDisplayed()) {
		   			Assert.assertTrue(true);
		   		}

		   
		
	
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
    
	
	
	
	
	
	
	
	
}
