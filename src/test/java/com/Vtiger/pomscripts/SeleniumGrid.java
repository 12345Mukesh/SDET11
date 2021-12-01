package com.Vtiger.pomscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid 
{
	RemoteWebDriver driver;
	@Test
	public void Seleniumgrid() throws MalformedURLException
	{
		URL url=new URL("http://192.168.132.1:4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(url,dc);
		driver.get("https://www.amazon.in/");
	}
	

}
	
	
	

