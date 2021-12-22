package com.practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkNaveen 
{
   public static void main(String args[])
   {
	 /*  
	   WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.freecrm.com");
			 driver.findElement(By.xpath("//span[text()='Log In']")).click();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("cmukesh391@gmail.com");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mukesh@123");
		 
		 driver.findElement(By.xpath("//div[text()='Login']")).click();
		 
		  //1.collecting the links and images of free crm
		  
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  links.addAll(driver.findElements(By.tagName("img")));
		  
		  System.out.println("size of full links and images------->"+links.size());
		  
		  //2.creating arraylist for active links
		  ArrayList<WebElement> activelinks = new ArrayList<WebElement>();
		  
		  //3.iterate links: exclude all the links/images- doesnot have any href attribbute
		  for(int i=0;i<links.size();i++)
		  {
			  if(links.get(i).getAttribute("a")!=null)
			  {
				    activelinks.add(links.get(i));
				  
				  
			  }
		  }
   
    //4. get the size of activelinks list
		  System.out.println("size of active links and images------>"+activelinks.size());
        
     */
	   
	   
	   WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.amazon.in");
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println("size of full links and images------->"+links.size());
	     
		   ArrayList<String> urllist = new ArrayList<String>(); 
		  for(WebElement e:links)
		  {
			  String url=e.getAttribute("href");
			  //urllist.add(url);
			  //checking the broken links
			  checkBrokenLink(url);
			  
		  }
	  
		  //Running parallely links and checking the start and end times
		  long stTime=System.currentTimeMillis();
	   urllist.parallelStream().forEach(e -> checkBrokenLink(e));
        long endTime=System.currentTimeMillis();
        
        System.out.println("Total time taken"+(endTime-stTime));
   
   driver.quit();
   }
	
	public static void checkBrokenLink(String linkurl)
	{
		try
		{
			
			URL url = new URL(linkurl);
	       HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();      
		   httpurlconnection.setConnectTimeout(5000);
		  httpurlconnection.connect();
		  if(httpurlconnection.getResponseCode()>=400)
		  {
			  System.out.println(linkurl+"----->"+httpurlconnection.getResponseMessage()+"is a broken link");
		  }
		  else
		  {
			  System.out.println(linkurl+"---->"+httpurlconnection.getResponseMessage());
		  }
		}
	
	   catch(Exception e)
		{
		   
		}
	
	}


}
