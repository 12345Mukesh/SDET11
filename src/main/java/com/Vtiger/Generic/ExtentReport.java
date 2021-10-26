package com.Vtiger.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport
{
	WebDriver driver;
	@Test
	public void Createorg_Test() throws Throwable
	{
   ExtentHtmlReporter reporter= new ExtentHtmlReporter("../SDET_11/src/test/resources/exr.html");
   reporter.config().setDocumentTitle("SDET-1");
   reporter.config().setReportName("VTiger");
   reporter.config().setTheme(Theme.DARK);
   
   
   
   ExtentReports reports= new ExtentReports();
    reports.attachReporter(reporter);
    
    reports.setSystemInfo("AppURL","http://localhost:8888");
    reports.setSystemInfo("ENV","TEST QA");
    reports.setSystemInfo("Build","2.1");
	reports.setSystemInfo("Reporter name", "Mukesh");
	
	ExtentTest test= reports.createTest("createorg");
	test.log(Status.PASS, "This Testcase has passed");
	
	
	FileUtility flib= new FileUtility();
	ExcelUtility Elib= new ExcelUtility();
	JavaUtility jlib= new JavaUtility();
	//open the browser
	String browsername = flib.readDatafromPropfile(IAutoConst.PROP_PATH,"browser");
	if (browsername.equals("chrome")) {
		driver = new ChromeDriver();
		System.out.println("chrome is opened");
	} else if (browsername.equals("ff")) {

	} else {
		System.out.println("please enter proper browser name");
	}
	
	//Enter the url
	driver.get(flib.readDatafromPropfile(IAutoConst.PROP_PATH,"url"));

	String abc = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 0, "Sheet1");
	String abc1 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 1, "Sheet1");
	String abc2 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 2, "Sheet1");
	String abc3 = Elib.readDatafromExcel(IAutoConst.EXCEL_PATH,0, 3, "Sheet1");

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.findElement(By.name("user_name")).sendKeys(flib.readDatafromPropfile(IAutoConst.PROP_PATH,"username"));
	driver.findElement(By.name("user_password")).sendKeys(flib.readDatafromPropfile(IAutoConst.PROP_PATH,"password"));
	driver.findElement(By.id("submitButton")).click();

	driver.findElement(By.xpath("//a[text()='Organizations']")).click();

	driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();

	
	String orgname = abc + jlib.generateRandomNo();
	driver.findElement(By.name("accountname")).sendKeys(orgname);

	WebElement industrydropdown = driver.findElement(By.name("industry"));
	Select industrydd = new Select(industrydropdown);
	industrydd.selectByVisibleText(abc1);

	WebElement ratingdropdown = driver.findElement(By.name("rating"));
	Select ratingdd = new Select(ratingdropdown);
	ratingdd.selectByValue(abc2);

	WebElement typedropdown = driver.findElement(By.name("accounttype"));
	Select typedd = new Select(typedropdown);
	typedd.selectByIndex(3);

	driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	Thread.sleep(4000);

	driver.findElement(By.xpath("//a[text()='Organizations']")).click();

	driver.findElement(By.name("search_text")).sendKeys(orgname);

	WebElement searchfldDropdown = driver.findElement(By.name("search_field"));

	Select searchdd = new Select(searchfldDropdown);
	searchdd.selectByVisibleText(abc3);

	driver.findElement(By.name("submit")).click();

	WebElement organisationname = driver
			.findElement(By.xpath("//a[@title='Organizations' and text()= '" + orgname + "']"));

	if (organisationname.isDisplayed()) {
		Assert.assertTrue(true);
	}

	driver.close();
	reports.flush();
	
	}
}
