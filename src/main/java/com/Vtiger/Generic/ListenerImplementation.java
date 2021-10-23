package com.Vtiger.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String failedTestCase = result.getMethod().getMethodName();
		String currentDate = new Date().toString().replace(":", "_").replace(" ", "_");
		EventFiringWebDriver ed=new EventFiringWebDriver(Baseclass.sdriver);
		File src = ed.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+failedTestCase+currentDate+".PNG");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
    
}
