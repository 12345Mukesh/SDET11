package collections;

import java.util.Scanner;

public class NumberProgram {

	public static void main(String[] args) 
	{
		//For list of prime numbers
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Starting value");
		int num=s.nextInt();
		
		System.out.println("Enter the Ending value");
		int num1=s.nextInt();
		
		for(int i=num;i<=num1;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{	
		     if(i%j==0)
		      {
		      count++;
			  }
			 }
		 if(count==2)
	     {
	      System.out.println(i + " is a prime number");
		  }
		 
		}
	 * /
	  
	  //single prime number
	  /*
	  Scanner s= new Scanner(System.in);
		System.out.println("Enter the Starting value");
	   int num=s.nextInt();
	   int count=0;
	  for(int i=1;i<=num;i++)
		{
	       if(num%i==0)
		      {
		      count++;
	     	  }
		}	  
		 if(count==2)
	     {
	      System.out.println(num + " is a prime number");
		  }
		  else
		  {
			  System.out.println(num +" is Not a prime number");
		  }
	  
	  */
	  
	  //Given number is perfect or not
	  /*
	      int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any integer you want to check:");
	        n = s.nextInt();
	        for(int i = 1; i < n; i++)
	        {
	            if(n % i == 0)
	            {
	                sum = sum + i;
	            }
	        }
	        if(sum == n)
	        {
	            System.out.println("Given number is Perfect");
	        }
	        else
	        {
	            System.out.println("Given number is not Perfect");
	        }    
	    
	  */
	  
	  //Group of perfect numbers in a list
	 
	   int n,n1, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter any Starting integer you want to check:");
	        n = s.nextInt();
			 System.out.print("Enter any Ending integer you want to check:");
	        n1 = s.nextInt();
			
	        for(int i = n; i < n1; i++)
	        {
				for(int j=1;j<=i;j++)
				{
	              if(n % j == 0)
	              {
	                sum = sum + j;
	              }
		       }
	         if(sum == n)
	        {
	            System.out.println(i +"Given number is Perfect");
	        } 
			
		  }
	 
	  
	  //strong number for single
		/*
		int n,i;
		int a,lastdig;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number : " );
		n = sc.nextInt();
		int total = 0;
		int backup = n;
		while(n != 0)
		{
		i = 1;
		a = 1;
		lastdig = n % 10;
		while(i <= lastdig)
		{
		a = a * i;
		i++;
		}
		total = total + a;
		n = n / 10;
		}
		if(total == backup)
		System.out.println(backup + " is a strong number\n");
		else
		System.out.println(backup + " is not a strong number\n");
		System.out.println();
	*/
	
	
		//Strong number for multiple
	/*
		Scanner cs=new Scanner(System.in);
		  int firstnumber, endnumber, i;
		        System.out.println("Enter the First number:");
		        firstnumber=cs.nextInt();
		        System.out.println("Enter the Last number:");
		        endnumber=cs.nextInt();
		    System.out.println("Strong numbers between "+firstnumber+" and "+endnumber+" are:");
		    for(i=firstnumber;i<=endnumber;i++)
		      {
		       int num2=i;
		       int num1=i;
		       int sum=0;
		       int fact=1;
		      while(num1!=0)
		      {   fact=1;
		          int rem=num1%10;
		          num1=num1/10;
		          for(int j=1;j<=rem;j++)
		           fact=fact*j;
		          sum=sum+fact;
		      }
		      if(sum==num2)
		       System.out.println(i+" ");
		      }
	*/
	  //Happy number	
	/*
		 int n, r = 1, num, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number=");
	        n = sc.nextInt();
	        num = n;
	   
	        while (num > 9)
	        {
	            while (num > 0)
	            {
	                r = num % 10;
	                sum = sum + (r * r);
	                num = num / 10;
	            }
	            num = sum;
	            sum = 0;
	        }
	        if (num == 1)
	        {
	            System.out.println("Happy Number");
	        }
	        else
	        {
	        	System.out.println("Not Happy Number");
	        }
	  */      
	  
		
		
//		 Scanner cs=new Scanner(System.in);
//	       int range1,range2;
//	       System.out.println("Enter a range:");
//	       range1=cs.nextInt();
//	       System.out.println("Enter group range");
//	       range2=cs.nextInt();
//	       System.out.println("Spy numbers between "+range1+" and "+range2+" are: ");
//	       for(int i=range1;i<=range2;i++)
//	       {
//	        int num=i,sum=0,rem;
//	         while(sum!=1 && sum!=4)
//	           {
//	          sum=0;
//	          while(num!=0)
//	          {
//	              rem=num%10;
//	              sum+=(rem*rem);
//	              num/=10;
//	          }
//	          num=sum;
//	          }
//	      if(sum==1)
//	       System.out.print(i+" ");
//	       }
		
		
		
	 //prime and palindrome
		/*
		 Scanner in= new Scanner(System.in);
	        int n,p,rev,s=0,i,c=0;
	        System.out.println("Enter No.");
	        n= in.nextInt(); // Input number from user
	        p=n; // store the entered number in "p" variable
	        for(i=1;i<=p;i++)
	        {
	            if(p%i==0)
	            {
	                c++;
	            }
	        }
	        while(n>0)
	        {
	            rev=n%10; // extract last digit of the number
	            s=s*10+rev; // store the digit last digit
	            n=n/10; // extract all digit except the last
	        }
	        
	        if(p==s&&c==2) // comparing with original number
	        {
	            System.out.println("Number is PalPrime : "+p);
	        }
	        else
	        {
	            System.out.println("Number is not PalPrime : "+p);
	        }
	        
	        
	       */ 
	        
//		
//	        
	        
	        
	        
	        
	        

	}

}
