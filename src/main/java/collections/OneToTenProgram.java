package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class OneToTenProgram
{


	public static void main(String[] args)
	{
		
//-----------1.vowels comparision-------------------------------
	/*	
		String s1="MukeshSmart";
		char vowels[]= {'a','e','i','o','u'};
		s1=s1.toLowerCase();
		char name[]=s1.toCharArray();
		int k=0;
		String s="";
		for (int i = 0; i < name.length; i++) 
		{
			for (int j = 0; j < vowels.length; j++)
			{
				if(name[i]==vowels[j]) 
				{
					s=s+vowels[j];
				}

			}
		}
		System.out.println(s);
  */
		
//---------------2.Reverse the string using collection and normal class-----------

  		
	//	String s1="ROBINSON";
/*
		//using collection
		List l= new ArrayList();

		char c[] =s1.toCharArray();

		for (int i = 0; i < c.length; i++) 
		{
			l.add(c[i]);
		}
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);	
*/		
	//using normal
//		String rev="";
//		for(int i=s1.length()-1;i>=0;i--)
//		{
//			rev=rev+s1.charAt(i);
//			
//		}
//		System.out.println(rev);


		
//---------------------------3.Remove Duplicate set using Set Interface--------------------------------------------------------
	/*	
		String s1="RAMANA";
		char c[] =s1.toCharArray();

		HashSet s = new HashSet();	         //--------------------[A, R, M, N]-----------------------------------
	//	LinkedHashSet s= new LinkedHashSet();  //------------------[R, A, M, N]--------------------------------------
		//TreeSet s= new TreeSet();          //---------------------[A, M, N, R]--------------------------------------

		for (int i = 0; i < c.length; i++) 
		{
			s.add(c[i])	;
		}
		System.out.println(s);
  */
		
		
//-----------------------------4.Parser Double---------------------------------		
		
	/*	
		String s1="$ 125.8";
		String str[]=s1.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);

		double d= Double.parseDouble(str[1]);
		double sum=d+3;
		System.out.println(sum);

		String s3=Double.toString(sum);
		System.out.println(str[0]+s3);
	
	*/	
//----------------------------5.Using Maps-----------------------------------
		
	/*	
		String s1="TESTYANTRA";
		char c[] =s1.toCharArray();
		//HashMap<Character, Integer> hm= new HashMap<Character, Integer>();
    // LinkedHashMap<Character, Integer>= new LinkedHashMap<Character, Integer>();
		TreeMap<Character, Integer> hm= new TreeMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) 
		{
			if(hm.containsKey(c[i]))
			{
				hm.put(c[i], hm.get(c[i])+1);
			}
			else
				hm.put(c[i], 1);
		}
		System.out.println(hm);
		System.out.println(hm.keySet());
   
		//It will not print at the starting only it will enter into the containskey(c[i]) loop only
		//if it has multiple values then at a time it will print
		
	/*	
		//output:
		Hash map                                                     LinkedHashMap
		{A=2, R=1, S=1, T=3, E=1, Y=1, N=1}                       {T=3, E=1, S=1, Y=1, A=2, N=1, R=1}
		[A, R, S, T, E, Y, N]                                     [T, E, S, Y, A, N, R]

		Tree map
		{A=2, E=1, N=1, R=1, S=1, T=3, Y=1}
        [A, E, N, R, S, T, Y]
	*/	

//-----------------------------using prime in List-------------------
	/*
		
		int a=0;
		int b=1;
		int sum;
		int count=0;
		System.out.println(a);
		System.out.println(b);
		ArrayList<Integer> a1= new ArrayList<>();

		for (int i = 0; i < 100; i++) 
		{
			sum= a+b;
			a1.add(sum);
			a=b;
			b=sum;
		}
		
		Iterator<Integer> i= a1.iterator();
		while(i.hasNext()) 
		{
			int n= i.next();
			for (int j = 1; j <= a1.size(); j++) 
			{
				
				if(n%j==0)
				{
					count++;
				}
				if (count==2) 
				{
					
					System.out.println(n +" " +"prime");
				}
				else 
				{
					System.out.println("not prime");

				}
			}
		}
		
	*/	
		
//------------------------char At-------------
		
		
//		String s1="oppo";
//		String s2="";
//		for (int k = s1.length()-1; k >=0 ; k--) 
//		{
//			System.out.print(s1.charAt(k)+s2);
//		}
//		if(	s1.equals(s2));
//		{
//			System.out.println(' ' );
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
