package AllTypePrograms;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionPrograms {

	public static void main(String[] args)
	{
	//1.Integer array
	 /*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter a number");	
	 	 int c=sc.nextInt();
		int[] a= new int[c];
		System.out.println("Enter array values");
		//Assigning values one by one in array
		for(int i=0;i<c;i++ )
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<c;j++ )
		{
			for(int k=j+1;k<c;k++ )
			{
			//1.First sorting the values	
				if(a[j]>a[k])
				{
				  int temp=a[j];
				  a[j]=a[k];
				  a[k]=temp;
				}
			//2.Then removing the duplicate values	
			  if( a[j]==a[k])
				{
					a[k]=0;
				}
			}
		//3.Then printing the values which is not equal to zero	
		 if(a[j]!=0  )
		 {
			 System.out.println(a[j]);
		 }
		 
		
		}
    */		
		
	//2.For char values	
		/*
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter a number");	
	 	 int c=sc.nextInt();
		char[] a= new char[c];
		System.out.println("Enter array values");
		//Assigning values one by one in array
		for(int i=0;i<c;i++ )
		{
		a= sc.next().toCharArray();
		}
		
		for(int j=0;j<c;j++ )
		{ 
			for(int k=j+1;k<c;k++ )
			{
			//1.First sorting the values	
				if(a[j]>a[k])
				{
				  char temp=a[j];
				  a[j]=a[k];
				  a[k]=temp;
				}
			//2.Then removing the duplicate values	
			  if( a[j]==a[k])
				{
					a[k]=0;
				}
			}
		//3.Then printing the values which is not equal to zero	
		 if(a[j]!=0  )
		 {
			 System.out.println(a[j]);
		 }
		 
		
		}
   */   		
		
//3.Reverse the String
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the string");	
	 	 String a=sc.nextLine();
	 	 char[] c=a.toCharArray();
	 	 ArrayList a1= new ArrayList<>( );
         for(int i=0;i<a.length();i++ )
         {
        	 a1.add(c[i]);
         }
		  Collections.reverse(a1);
		  System.out.println(a1);
    */
   //ii.Reverse the list
    /*		
		  LinkedList l1= new LinkedList<>( );
		  Scanner	sc=new	Scanner(System.in);	
		 	 System.out.println("enter the number");	
		 	 int a1=sc.nextInt();
		 	 int [] a= new int[a1];
		 	 System.out.println("Enter array values");
		 	 for(int i=0;i<a1;i++ )
		 	 {
		 		 a[i]=sc.nextInt();
		 	 }
		 	 
		 	 for(int i=0;i<a.length;i++ )
	         {
	        	 l1.add(a[i]);
	         }
		 	 
		  System.out.println("Before Sorting" + l1);
		  Collections.sort(l1);
		  System.out.println("After Sorting " + l1);
		  Collections.reverse(l1);
		  System.out.println("Reverse list: " + l1);
		*/  
		  
		  

		  LinkedList l1= new LinkedList<>( );
		  Scanner	sc=new	Scanner(System.in);	
		 	 System.out.println("enter the number");	
		 	 int a1=sc.nextInt();
		 	 char [] a= new char[a1];
		 	 System.out.println("Enter array values");
		 	 for(int i=0;i<a1;i++ )
		 	 {
		 		 a=sc.next().toCharArray();
		 	 }
		 	 
		 	 for(int i=0;i<a.length;i++ )
	         {
	        	 l1.add(a[i]);
	         }
		 	 
		  System.out.println("Before Sorting" + l1);
		  Collections.sort(l1);
		  System.out.println("After Sorting " + l1);
		  Collections.reverse(l1);
		  System.out.println("Reverse list: " + l1);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
