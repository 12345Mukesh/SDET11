package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MMTDATAPROVIDER
{

	@Test(dataProvider="cities")

	public  void main(String src, String dest) throws Throwable 
	{

		Date dateobj= new Date();

		//Give today date and time
		String currentdate= dateobj.toString();
		System.out.println(currentdate);

		//Tue Oct 05 13:12:43 IST 2021
		// 0   1   2    3      4    5

		String[] arr= currentdate.split(" ");

		String date=arr[2];
		String day=arr[0];
		String month= arr[1];
		String year= arr[5];
		String todaydate= day+" "+month+" "+date+" "+year;
		//System.out.println(todaydate);

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//For clicking somewhere around to disable popup
		Actions ac= new Actions(driver);
		ac.moveByOffset(10, 10).click().perform();

		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

		//clicking on fromCity and giving data as BOM
			driver.findElement(By.id("fromCity")).sendKeys(src);
//		driver.findElement(By.id("fromCity")).click();
//		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(src);
		//			//clicking the text contains BOM by using contains text()   because of Dynamic dropdown
		System.out.println(src);
		driver.findElement(By.xpath("//div[contains(text(),'"+src+"')]")).click();


		//clicking on toCity and giving data as MAA
		driver.findElement(By.id("toCity")).sendKeys(dest);
//		driver.findElement(By.id("toCity")).click();
//		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(dest);
		//clicking the text contains BOM by using contains text()   because of Dynamic dropdown
		driver.findElement(By.xpath("//div[contains(text(),'"+dest+"')]")).click();


		//clicking on Departure button of calendar
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();  
		//In Calendar after Entering we should do softcoding by (writing Date method and String[] arr= currentdate.split(" ") method)  
		driver.findElement(By.xpath("//div[@aria-label='"+todaydate+"']")).click();

	}

	@DataProvider()
	public Object[][] cities()
	{
		Object [][] obj= new Object[3][2];

		obj[0][0]="HYD";
		obj[0][1]="BOM";
		
		obj[1][0]="PNQ";
		obj[1][1]="MAA";
		
		obj[2][0]="BOM";
		obj[2][1]="HYD";
		return obj;
	}
}
