package com.Vtiger.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Vtiger.ObjectRepo.HomePage;
import com.Vtiger.ObjectRepo.LoginPage;

public class Baseclass 
{
	public WebDriver driver;
	public FileUtility fileutility= new FileUtility();
	public HomePage hp;
	public static WebDriver sdriver;
	
	@BeforeSuite(groups={"smoke","sanity","regression"})
	public void startconnection()
	{
		System.out.println("Started the connection with Database");
	}
	
	@AfterSuite(groups={"smoke","sanity","regression"})
	public void closeconnection()
	{
		System.out.println("Close the Database Connection");
	}
	
	@Parameters("browser")
    @BeforeClass(groups={"smoke","sanity","regression"})
    public void launchbrowser(String browsername) throws Throwable
    {
    	//String browsername=fileutility.readDatafromPropfile("browser");
    	if
    	(browsername.equals("chrome"))
    	{
    		driver = new ChromeDriver();
    	}
    	else if
    	(browsername.equalsIgnoreCase("Firefox"))
    	{
    		
    		driver = new FirefoxDriver();
    	}
    	else if
    	(browsername.equalsIgnoreCase("safari"))
    	{
    		driver = new SafariDriver();
    	}
    	//sdriver=driver;
    	driver.get(fileutility.readDatafromPropfile("url"));
    	driver.manage().window().maximize();
    }
	
	
    @BeforeMethod(groups={"smoke","sanity","regression"})
    public void logindetails() throws Throwable
    {
    	LoginPage lp= new LoginPage(driver);
    	lp.logintoApp();
    }
    
    
    @AfterMethod(groups={"smoke","sanity","regression"})
    public void logout()
    {
    	hp = new HomePage(driver);
    	hp.logoutfromApp();
    }
    
    
	@AfterClass(groups={"smoke","sanity","regression"})
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
}
