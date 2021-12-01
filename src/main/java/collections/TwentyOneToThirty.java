package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class TwentyOneToThirty {

	public static void main(String[] args) 
	{
	 /*	
		//-----------------------1.synchronization list---------------------
		LinkedList a1= new LinkedList<>();
	 //	ArrayList a1= new ArrayList(); 
		a1.add(10); 
		a1.add(15); 
		a1.add(30); 
		a1.add(20); 
		a1.add(5); 
           Collections.synchronizedList(a1);
           System.out.println(a1);
	/*	
	//output
      For ArrayList     
     [10, 15, 30, 20, 5]      
		
	For Linked List	
		[10, 15, 30, 20, 5]
		
		
	*/	
	
   //-----------------------------2.Array Duplicates------------------------
      
      /*		
		int arr[]= {2,3,5,2,5,1,3,4,5,6,7,2};
		int count;
		for (int i = 0; i < arr.length; i++) 
		{                                                          //output
			count=1;                                              // 2 3 5 1 4 6 7 
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j]) 
				{
				 count++;	
				arr[j]='0';
				}
			}
			if(count>=1 && arr[i]!='0') 
			{
				System.out.print(arr[i]+" ");
			}
            
		}   
     */      
		
 //-------------------------------3.Insertion order for Hash,Linked Hash, Tree Map------------------------------          
     /*      
		System.out.println("HashMap insersation order not maintained ");
		HashMap<Integer,String> hs= new HashMap<>();
			hs.put(1, "c");
			hs.put(3, "a");
			hs.put(5, "b");
			hs.put(2, "d");
			hs.put(8, "f");
			
			for(Map.Entry m : hs.entrySet())
			{    
			       System.out.println(m.getKey()+" "+m.getValue());     

			}
			
			System.out.println("Linked hash map-- Insersation order maintained");
			LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
			lhm.put(1, "c");
			lhm.put(7, "a");
			lhm.put(3, "b");
			lhm.put(4, "d");
					
			for(Map.Entry n : lhm.entrySet())
			{    
			       System.out.println(n.getKey()+" "+n.getValue());     

			}

			System.out.println("Tree MAp---Natural sorting takes place");
			
			TreeMap<Integer, String> tm = new TreeMap<>();
			tm.put(1, "Pa");
			tm.put(1, "Pk");
			tm.put(5, "PP");
			tm.put(3, "PP");
			
			for(Map.Entry o: tm.entrySet()) 
			{
				 System.out.println(o.getKey()+" "+o.getValue());     
			}
           
		/*  output
		
		HashMap insersation order not maintained 
1 c
2 d
3 a
5 b
8 f
Linked hash map-- Insersation order maintained
1 c
7 a
3 b
4 d
Tree MAp---Natural sorting takes place
1 Pk
3 PP
5 PP
		
*/
	
//---------------------4.occurence of string--------------------------	
  
	/*	
		String s1= "pavana";
		
		int count;
		char arr[]=s1.toCharArray();
		String s2="";
		for (int i = 0; i < arr.length; i++) 
		{
			count =1;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[i]==(arr[j]))
				{
					count++;
					arr[j]='0';
				}
			}
			if(arr[i]!='0'&& count>=1) 
			{
				s2=s2+arr[i];
				System.out.println(arr[i]+" count is="+count );  
			}
		}
		System.out.println(s2);
	
	/*output
	 * 
	 * p count is=1
       a count is=3
       v count is=1
       n count is=1
       pavn

	 * 
	 * 
	 */
	
//-------------------------------------5.occurence of word------------------------	
	/*
		int count1;
		String s1= "my country is my mom and i love my mom";
		String str[]=s1.split(" ");
		String s2="";
		int itemCount1 = str.length;
		System.out.println(itemCount1);

		for (int i = 0; i < str.length; i++) 
		{
			count1=1;
			for (int j = i+1; j < str.length; j++) 
			{

				if (str[i].equals(str[j])) 
				{
					count1++;
					str[j]="0";
				}
			}
			if(str[i]!="0" && count1>=1)
			{
				s2=s2+" "+str[i];
				System.out.println(str[i]+" count is "+count1);
			}
		}
	  System.out.println(s2);
	
	/*  output
	       
	        10                                               If we remove = in count>=1 then we will get only duplicate values
	   my count is 3                                        10
       country count is 1                                  my count is 3
       is count is 1                                       mom count is 2
       mom count is 2                                       my mom

       and count is 1
       i count is 1
       love count is 1
       my country is mom and i love
                                                    
                                                            
                                                            
*/
	
//------------------------------6.Removing duplicates and adding iterator in setInterface	
	/*
		String s1="apple";
		char arr[]	=s1.toCharArray();
		LinkedHashSet hs= new LinkedHashSet<>();  
      // HashSet hs= new HashSet<>();
		// TreeSet hs= new TreeSet<>();
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			hs.add(arr[i]);
		}
		System.out.println(hs);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) 
		{
			System.out.print(it.next());
		}
		System.out.println();
		System.out.println("=========");

	/*	
   //output	
	Hash set
	[p, a, e, l]
    pael
    =========
	Linked Hash set
	[a, p, l, e]
    aple
    =========
    Treeset
	[a, e, l, p]
    aelp
    =========
	*/

//------------------------7.No of words count--------------------------------
	/*	
	
		String sampleSentence = "The quick Flash of The quick";
		String[] words = sampleSentence.split(" ");
		int itemCount = words.length;
		String word=" ";
		int count;
		System.out.println("The number of words is: " + itemCount);
		for (int i = 0; i < words.length; i++) 
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			
			if(words[i]!="0" && count>=1)
			{
				word=word+" "+words[i];
				System.out.println(words[i]+" count "+count);
				
		 }	
		}
		
		System.out.println(word);
	/*	
		output
		The number of words is: 6
        The count 2
        quick count 2
        Flash count 1
        of count 1
        The quick Flash of

		
	*/	
		
//--------------------------------8.swaping string--------------------		
	/*	
		String s1="Banglore";
		String s2="Pune";
		System.out.println("Before Swaping="+s1+" "+s2);
		s1=s1.concat(" "+s2);
		
		s2= s1.split(" ")[0];
		s1=s1.split(" ")[1];

		System.out.println("After Swapping= "+s1+" "+s2);
		
	/*	
		output
		Before Swaping=Banglore Pune
        After Swapping= Pune Banglore
	*/	
		
//------------------9.Rotate String word wise------------------------		
	/*
		
		String s= "Happy Pongal to everyone";
		
		String st[]=s.split(" ");
		
		for (int i = st.length-1; i >=0; i--) 
		{
			int index=i;
			for (int j=st.length; j >0; j--) 
			{
				System.out.print(st[index]+" ");
				index++;
				index=index%4;
			}
			System.out.println();		
		}
		
	/*	
		output
		---------
		with j>=0
		--------------------------------
		everyone Happy Pongal to everyone 
        to everyone Happy Pongal to 
        Pongal to everyone Happy Pongal 
        Happy Pongal to everyone Happy 
		
		with j>0
		--------------------------------
		everyone Happy Pongal to 
        to everyone Happy Pongal 
        Pongal to everyone Happy 
        Happy Pongal to everyone 
*/		
		
		
//-----------------------------10.Reverse the string----------------------------		
		
	/*	
		String s= "RameshSundaram";
		System.out.println("Given string is "+s);
		char c[]=s.toCharArray();
		String s1=" ";
		for (int i = c.length-1; i >= 0; i--) 
		{  
			s1=s1+c[i];
		}
		System.out.print (s1);
		
	/*	
		output
		Given string is RameshSundaram
        maradnuShsemaR
	*/	
	
//--------------------11.Removing spaces----------------------------------	
	

		String s= "i am          student          of QSP";
		String str[]=s.split(" ");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i]);
		}
	
	//output
	//  iamstudentofQSP
	
	

//---------------------	12.Entering the character and counting in the string
 	/*	
		int count=0;
		String s= "hello everyone";
		char c[]=s.toCharArray();
		System.out.println("enter the character");
			Scanner scan=new Scanner(System.in);
			char st= scan.next().charAt(0);
			for (int i = 0; i < c.length; i++) 
			{
				if(st==c[i]) 
				{
					count++;
				}
			}
			System.out.println(count);
		
/*output		
		enter the character
        o
        2

*/		
		
//-------------------------13.Counting the letters---------------------------		
	/*	
		String s="India";
		char c[]=s.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++)
		{
			count++;
		}
		System.out.println(count);	
		
	/*	
		output
		5
	*/
	
//------------------------14.	
	
	
//		String s1= "Character";
//		int count=0;
//		char c[]=s1.toCharArray();
//		char c1[]=c;
//		//	System.out.println(c[2]);
//		for (int i = 0; i < c.length-1; i++) 
//		{
//			//int count = 0;
//			for (int j = 0; j < c.length-1; j++) 
//			{
//				if (c[i]==c1[j]);
//				count++;
//				System.out.print(c[i]);
//
//			}
//		}
//		if(count>1) 
//		{
//						
//		}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
