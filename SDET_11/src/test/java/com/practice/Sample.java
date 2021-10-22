package com.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Sample 
{
   @BeforeMethod
   public void Before()
   {
	   System.out.println("Method before");
   }
	
   @AfterMethod()
   public void After()
   {
	   System.out.println("Method Afer");
   }
   
   
   @Test
   public void A()
	{
		System.out.println("Method  A will be printed");
	}
   
   
	@Test
	public void B()
	{
		System.out.println("Method B will be printed");
	   Assert.assertEquals(true, false);
	}
	
	
	
}
