package com.Vtiger.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest
{
@Test
public void method()
{
	String url=System.getProperty("url");
    String username=System.getProperty("username");
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();

}
	
	
	
	
}
