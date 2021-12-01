package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) 
	{
	WebDriver driver= new ChromeDriver( );
	driver.manage( ).timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bang");
	driver.findElement(By.xpath("//li[text( )='Madiwala, Bangalore']")).click();
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Hyd");
	driver.findElement(By.xpath("//li[text( )='Kukatpally, Hyderabad']")).click();
	Date date1= new Date( );
	String dateobj=date1.toString();
	String[] arr= dateobj.split(" ");

	String date=arr[2];
	String day=arr[0];
	String month= arr[1];
	String year= arr[5];
	String todaydate= day+" "+month+" "+date+" "+year;
	driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
	driver.findElement(By.xpath("//div[@class='rb-calendar'"+todaydate+"']")).click();
	driver.findElement(By.xpath("//button[text( )='Search Buses']")).click();
	}

}
