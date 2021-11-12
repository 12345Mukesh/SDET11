package vtiger;


import java.util.Random;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Vtiger.Generic.Baseclass;
import com.Vtiger.Generic.ExcelUtility;
import com.Vtiger.Generic.IAutoConst;


@Listeners(com.Vtiger.Generic.ListenerImplementation.class)
public class Tc_001_CreateContact_org_Test extends Baseclass {


	@Test
	public void CreatecontactTest() throws Throwable {

		
		ExcelUtility Elib= new ExcelUtility();
		
		//clicking on contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		//clicking on + button
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		//Selecting first name in Dropdown
		String abc1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 4, "Sheet1");
		WebElement First = driver.findElement(By.name("salutationtype"));
		Select Firstdd = new Select(First);
		Firstdd.selectByValue(abc1);

		Random random = new Random();
		int randomnumber = random.nextInt(1000);
		System.out.println(randomnumber);

		//selecting last name and mobile number
		String abc4 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 1, "Sheet1");
		String abc5 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,1, 2, "Sheet1");
		driver.findElement(By.name("lastname")).sendKeys(abc4);
		driver.findElement(By.id("mobile")).sendKeys(abc5);

		//clicking the dropdown of leadsource
		String abc2 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 5, "Sheet1");
		WebElement Leadsource = driver.findElement(By.name("leadsource"));
		Select Lead = new Select(Leadsource);
		Lead.selectByValue(abc2);

		//clicking on save button
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();

		Thread.sleep(4000);

		//-----------verifying process-------------------
		//clicking on again contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		//Entering data into textbox
		driver.findElement(By.xpath("//input[@class='txtBox']")).sendKeys(abc4);
		String abc3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 6, "Sheet1");

		//selecting value from dropdown
		WebElement Indropdown = driver.findElement(By.id("bas_searchfield"));
		Select Indd = new Select(Indropdown);
		Indd.selectByVisibleText(abc3);

		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		//
		WebElement contactname = driver.findElement(By.xpath("//a[@title='Contacts' and text()='" + abc4+ "']"));

		if (contactname.isDisplayed()) {
			Assert.assertTrue(false);
		}

		

	}

}
