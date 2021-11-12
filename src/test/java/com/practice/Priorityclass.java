package com.practice;

import org.testng.annotations.Test;

public class Priorityclass 
{
    @Test(priority=8)
	public void priority1()
	{
		System.out.println("Method 1");
	}
	@Test(priority=0)
	public void zriority2()
	{
		System.out.println("Method 2");
	}
	@Test(priority=-20)
	public void priority3()
	{
		System.out.println("Method 3");
	}
	
}
