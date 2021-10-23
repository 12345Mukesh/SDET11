package com.Vtiger.pomscripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclass;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.IAutoConst;
import com.Vtiger.ObjectRepo.ContactInfopage;
import com.Vtiger.ObjectRepo.CreateNewContactPage;
import com.Vtiger.ObjectRepo.HomePage;

public class Tc_002_CreateContact_org_Test extends Baseclass {

	@Test
	public void CreateContactTestWindowHandle() throws Throwable 
	{

		ExcelUtility Elib= new ExcelUtility();
		//open the browser


		hp =new HomePage(driver);
		hp.getContactslink().click();

		ContactInfopage cip= new ContactInfopage(driver);
		cip.createcont();  

		//clicking on dropdown

		String abc1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 4, "Sheet1");
		CreateNewContactPage cnp= new CreateNewContactPage(driver);
		cnp.firstdropdown(abc1);

		String abc4 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 1, "Sheet1");
		String abc5 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 2, "Sheet1");
		cnp.lastname().sendKeys(abc4);
		cnp.mobile().sendKeys(abc5);

		//Window Handling
		WebElement abc = driver.findElement(By.xpath("(//img[@title='Select'])[1]"));
		abc.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();

		String parentWindow = window.next();
		String childWindow = window.next();

		driver.switchTo().window(childWindow);

		driver.findElement(By.id("search_txt")).sendKeys(Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 0, "Sheet1"));

		driver.findElement(By.name("search")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@id='1' and text()='" + Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 0, "Sheet1") + "']"))
		.click();

		driver.switchTo().window(parentWindow);

		String abc2 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 5, "Sheet1");
		cnp.seconddropdown(abc2);

		cnp.getSavecontbtn().click();

		//Again clicking on Contacts
		hp.getContactslink().click();		
		//sending data in text boz
		cip.contactname().sendKeys(abc4);

		String abc3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 6, "Sheet1");
		cip.selectdropdown(abc3);

		cip.submit();

		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

		if (contactname.isDisplayed()) {
			Assert.assertTrue(true);
		}


	}

}
