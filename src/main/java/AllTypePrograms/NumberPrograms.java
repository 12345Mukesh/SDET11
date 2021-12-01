package AllTypePrograms;

import java.util.Scanner;

public class NumberPrograms {

	public static void main(String[] args) 
	{
		//1.program from 1 to n
		/*
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    for(int i=0;i<str;i++ )
	    {
	    	System.out.println(i);
	    }
    */
	  //2.Reverse n to 1
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    for(int i=str;i>=1;i-- )
	    {
	    	System.out.println(i);
	    }
	*/	
		
  //3. sum of 1 to n
	  /*	
        int sum=0;
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    for(int i=0;i<str;i++ )
	    {
	    	sum=sum+i;
	    }
	    System.out.println(sum);
	*/	
		
 //4. check given number is even or odd		
		/*
		  int sum=0;
			Scanner	sc=new	Scanner(System.in);	
		 	 System.out.println("enter the number ");	
		    int	str=sc.nextInt();
		    	if(str%2==0 )
		    	{
		    		System.out.println(str + " is a Even number");
		    	}
		    	else
		    	{
		    		System.out.println(str+"is a Odd number");
		    	}
		    */    
		    
  //5.prime number set of numbers
		/*
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    
	    for(int i=1;i<=str;i++)
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
		    
	 */	
		
	//ii.single prime number
		/*
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    for(int i=1;i<=str;i++)
	    {
	    	if(str%i==0 )
	    	{
	    		System.out.println(str +" is a prime number");
	    	}
	    }
	  */
	
 //6. sum of prime
  	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<=str;i++)
	    {
	    	int count=0;
	    	for(int j=1;j<=i;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			sum=sum+i;
	    			count++;
	    		}	
	    	}
	    	 if(count==2)
	   	        {
	   	    	  System.out.println(i + " is a prime number");
	   		    System.out.println(sum);
	   	        }
	    }
		*/ 
 //7.multiplication table
		//for single number
	 /*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    int c;
	    for(int i=1;i<=10;i++)
	    {
	    	c=str*i;
	    	System.out.println(str+"*"+i+"="+c);
	    }
	 */ 
	
		//ii.multiplication For set of numbers 
		 /*	
			Scanner	sc=new	Scanner(System.in);	
		 	 System.out.println("enter the number ");	
		    int	str=sc.nextInt();
		    int c;
		    for(int i=1;i<=str;i++ )
		    {
		    for(int j=1;j<=10;j++)
		    {
		    	c=j*i;
		    	System.out.println(i+"*"+j+"="+c);
		     }
		    }
		  */  
		
		
		
		
	//8.perfect number
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	str=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<str;i++)
	    {    	
	    	if(str%i==0 )
	    	{
	    		sum=sum+i;
	    	}
	    }
   		if(sum==str)
   		{
   			System.out.println(sum +" is a perfect number ");
   		}
		
   		else
   		{
   			System.out.println(sum +" is not a perfect");
   		}
	*/	
		
//ii.Group of perfect numbers
	 /*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the Starting number ");	
	    int	str=sc.nextInt();
	    Scanner	sc1=new	Scanner(System.in);	
	 	 System.out.println("enter the Ending number ");	
	    int	str1=sc1.nextInt();
	    int sum=0;
	    for(int i=str;i<=str1;i++ )
	    {
	    	
	    	for(int j=1;j<i;j++)
	    	{
	    		if(str%j==0 )
	    		{
	    			sum=sum+j;
	    		}
	    	}
	    	if(sum==str )
		    {
		    	System.out.println(i+ " is a perfect number ");
		    }
	    	else
	    	{
	    		System.out.println(i +"not a perfect number");
	    	}
	    	
	    }
	   */ 
	    
	//9.palindrome    
   /*	    
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the number ");	
	    int	n=sc.nextInt();
	    int backup=n;
	    int rem;
	    int rev=0;
	    while(n>0 )
	    {
	    	rem=n%10;
	    	n=n/10;
	    	rev=( rev*10)+rem;
	    }
	    System.out.println("Actual number is" + backup);
	    if(backup==rev)
	    {
	    	System.out.println(rev + "is a palindrome number");
	    }
	    else
	    {
	    	System.out.println("Not a palindrome number");
	    }
    */
	    
 //10. Factorial
		/*
		Scanner	sc=new	Scanner(System.in);	
		 System.out.println("enter the number ");	
		    int	n=sc.nextInt();
		    int fact=1;
	     for(int i=n;i>=1;i--)
	     {
	    	 fact=fact*i;
	     }
	    	System.out.println(n + " factorial of a  given number is = " + fact); 
	    */
	    
//11. Fibonacci
		/*
		Scanner	sc=new	Scanner(System.in);	
		 System.out.println("enter first number ");	
		    int	n=sc.nextInt();
		    Scanner	sc1=new	Scanner(System.in);	
			 System.out.println("enter second number ");	
			    int	n1=sc1.nextInt();
			    int n2;
		   for(int i=1;i<=6;i++)
		   {
			   n2=n+n1;
			   System.out.println("Fibonacci number is" + n2);
			   n=n1;
			   n1=n2;
			   
		   }
	    */
 //12.Reverse of number
	 /*	
		Scanner	sc=new	Scanner(System.in);	
		 System.out.println("enter first number ");	
		    int	n=sc.nextInt();
		    int rem;
		    int rev=0;
		    while(n>0 )
		    {
		    	rem=n%10;
		    	n=n/10;
		    	rev=( rev*10)+rem;
		    }
	    System.out.println("Reverse of a number is : " +rev);
	   */ 
		
	//13.ArmStrong
	  /*	
		Scanner	sc=new	Scanner(System.in);	
		 System.out.println("enter first number ");	
		    int	n=sc.nextInt();
		    int rem;
	        int backup=n;
		    int arm=0;
		    while(n>0 )
		    {
		    	rem=n%10;
		    	n=n/10;
		    	arm=arm+(rem*rem*rem );
		    }
        
	       System.out.println("Actual number is:" + n);
	    if(backup==arm )
	    {
	    	System.out.println(arm + " is a armstrong number");
	    }
	    else
	    {
	    	System.out.println("not a armstrong number");
	    }
      */	    
		
	//14. prime palindrome  
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	a	number");	
	 	 int	n	=sc.nextInt();	
	 	 int	t=n;	
	 	 int	rev=0;	
	 	 int	rem,i;	
	 	 while	(n!=0)	
	 	 {	
	 		 rem=n%10;
	 		 n=n/10;
	 	 	 rev=rev*10+rem;		
	 	 }	
	 	 if	(rev==t)	
          {	
	 	 	 for( i=2;i<rev	;i++)	
	 	 	 {	
	 	 	 	 if(rev	%i==0)	
	 	 	 	 {	
	 	 	 	 	 System.out.println("not a prime palindrome");	
	 	 		 	 break;	
	 	  	 	 }	
	 	 	 }	
	 	 	 if(rev==i)	
	 	 				{	
	 	 		 	 	 System.out.println(t+	"is	a	prime	palindrome	number");	
	 	 		 	 }	
	 	 		 	 else	
	 	 		 	 System.out.println(t+	"is	not	a	prime	palindrome	number");
		*/
		
		
		
		
		
		
	    
	}
}
