package com.Vtiger.Generic;

import java.util.Date;
import java.util.Random;

public class JavaUtility
{

	public int generateRandomNo() 
	{
		Random random = new Random();
		return random.nextInt(1000);
	}
	
	public String getCurrentDate()
	{
		Date dateobj= new Date();
		String currentdate= dateobj.toString();
		System.out.println(currentdate);
		return currentdate;
		
//		String[] arr= currentdate.split(" ");
//		
//		String date=arr[2];
//		String day=arr[0];
//		String month= arr[1];
//		String year= arr[5];
//		String todaydate= day+" "+month+" "+date+" "+year;
		//System.out.println(todaydate);
		
	}
	
	
	
	
}
