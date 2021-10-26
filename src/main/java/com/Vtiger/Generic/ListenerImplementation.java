package com.Vtiger.Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener
{
	
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		test.log(Status.FAIL, "This method"+result.getMethod().getMethodName()+"Has Failed");
		test.log(Status.FAIL, result.getThrowable());
		
		
		
		try {
			String path = Baseclass.getscreenshot(result.getMethod().getMethodName());
			
			test.addScreenCaptureFromPath("../SDET_11/null/Screenshots");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		
	    reports.flush();	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		JavaUtility jv= new JavaUtility();
		String date=jv.getCurrentDate();
		
		   reporter= new ExtentHtmlReporter("../SDET_11/src/test/resources/vtiger"+date+".html");
		   reporter.config().setDocumentTitle("SDET-1");
		   reporter.config().setReportName("VTiger");
		   reporter.config().setTheme(Theme.DARK);
		
		    reports= new ExtentReports();
		    reports.attachReporter(reporter);
		
		    
		    reports.setSystemInfo("AppURL","http://localhost:8888");
		    reports.setSystemInfo("ENV","TEST QA");
		    reports.setSystemInfo("Build","2.1");
			reports.setSystemInfo("Reporter name", "Mukesh");
		    
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
	  test.log(Status.SKIP, "This Method"+result.getMethod().getMethodName()+"Has Skipped");	
	}

	@Override
	public void onTestStart(ITestResult result)
	{
	
		test= reports.createTest(result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		test.log(Status.PASS, "This Method"+result.getMethod().getMethodName()+"has Passed");
	}
    
}
