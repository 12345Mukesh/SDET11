package com.contact;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclass;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.IAutoConst;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.HomePage;



public class Tc_001_CreateContact_Email_Test extends Baseclass
{     

	@Test
	public void Tc001_CreateContactwithEmail() throws Throwable
	{

		ExcelUtility Elib= new ExcelUtility();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//open the browser
		 hp= new HomePage(driver);
		hp.getContactslink().click();

		ContactInfopage cip= new ContactInfopage(driver);
		cip.createcont();  

		//selecting the dropdown
		String abc1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 4, "Sheet1");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown(abc1);


		String abc4 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 3, "Sheet1");
		String abc5 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 2, "Sheet1");
		cnp.lastname().sendKeys(abc4);
		cnp.mobile().sendKeys(abc5);

		//selecting title and department
		String abc6 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 4, "Sheet1");
		cnp.title().sendKeys(abc6);
		String abc7 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 5, "Sheet1");
		cnp.department().sendKeys(abc7);

		//selecting Email id and Emailoptout

		String abc8 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 6, "Sheet1");
		cnp.email().sendKeys(abc8);

		cnp.emailcheckbox().click();

		//clicking on Reference checkbox
		cnp.reference().click();

		//clicking on save button
		cnp.getSavecontbtn().click();

		//Again clicking on Contacts
		hp.getContactslink().click();		
		//sending data in text boz
		cip.contactname().sendKeys(abc4);
		//selecting the dropdowntype
		String abc3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 6, "Sheet1");
		cip.selectdropdown(abc3);
		//click on submit button
		cip.submit();

		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

		if (contactname.isDisplayed()) {
			Assert.assertTrue(true);
		}




		









	}













}
