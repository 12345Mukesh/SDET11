package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks1
{
  public static void main(String args[])
  {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 List<WebElement> webElements = driver.findElements(By.tagName("a"));
	 System.out.println(webElements.size());
	 for(int i=0;i<webElements.size();i++)
	 {
		 System.out.println(webElements.get(i).getText());
		 WebElement ele = webElements.get(i);
		 String url=ele.getAttribute("href");
		 verifyLinkActive(url);
		 
	 }
	 
	  
	  
  }

public static void verifyLinkActive(String linkurl) 
{

	try {
		URL url = new URL(linkurl);
		   HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
		  httpurlconnection.setConnectTimeout(3000);
		  httpurlconnection.connect();
		  if(httpurlconnection.getResponseCode()==200)
		  {
			System.out.println(linkurl+"--->"+httpurlconnection.getResponseMessage());  
		  }
		  if(httpurlconnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		  {
			  System.out.println(linkurl+"--->"+httpurlconnection.getResponseMessage());
		  }
	}  
		  
		catch(Exception e)
		{
			
		}
		  
		  

	
}
	
		
}
