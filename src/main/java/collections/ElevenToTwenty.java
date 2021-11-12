package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ElevenToTwenty {

	public static void main(String[] args) 
	{
	 /*	
	  *1.Removing Duplicate values for Array List and Linked List
	  *
		//ArrayList a=new ArrayList<>();
	    LinkedList a= new LinkedList<>();
		a.add(5);
		a.add(6);
		a.add(8);
		a.add(6);
		a.add(8);
		System.out.println(a);
                                                      //output
		                                              //1.For Array List
		for (int i = 0; i < a.size(); i++)            //[5, 6, 8, 6, 8] 
		{                                             //[5, 6, 8]
			for (int j = i+1; j < a.size(); j++) 
			{
				if(a.get(i)==a.get(j))               //2.LinkedList
				{                                   //same
					a.remove(j);                    
				}                    
			}
		}

		System.out.println(a);
	*/
		
//-----------------2.Reversing the List------------------------		
	/*
		//	LinkedList l1= new LinkedList<>();
		ArrayList l1= new ArrayList<>();
		l1.add(12);
		l1.add(15);
		l1.add(79);
		l1.add("hi");
		System.out.println("Before Reversing="+l1);
		Collections.reverse(l1);
		System.out.println("After Reversing="+l1);
		
		//output
		//Linked List
		//Before Reversing=[12, 15, 79, hi]
    	//	After Reversing=[hi, 79, 15, 12]
	//Array List same
  */
		
//---------------------3.Iterate Linked List--------------------------
	/*	
	 *  For ArrayList is not working
	 * 
		LinkedList l1=new LinkedList();
		l1.add(5);
		l1.add(2);                                                      //output:
		l1.add(8);                                                       //[5, 2, 8, 1]
		l1.add(1);                                                       //1
                                                                         //8
		System.out.println(l1);                                          //2
                                                                         //5
		Iterator it=l1.descendingIterator();
		{
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	*/	
//---------------------------4.Synchronized set-----------------
  /*
		
        //HashSet hs = new HashSet<>();
	//	LinkedHashSet hs= new  LinkedHashSet<>();
		TreeSet hs= new TreeSet<>();
		hs.add("first");
		hs.add("second");
		hs.add("third");
		System.out.println(hs);
		Collections.synchronizedSet(hs);
		System.out.println(hs);
		
		
		/*  output
		 *  
		 *  HashSet                        LinkedHashSet                                    Treeset
		 * [third, first, second]          [first, second, third]                           [first, second, third]
           [third, first, second]          [first, second, third]                           [first, second, third]
		 * 
		 */
		
		
//-----------------5.Shuffle List----------------------
	//It will shuffle everytime whenever we will execute them	
/*		
		ArrayList a1 = new ArrayList<>(); 
	//	LinkedList a1= new LinkedList<>();
		a1.add("Selenium"); 
		a1.add("Manual"); 
		a1.add("java"); 
		a1.add("Phython"); 
		a1.add("SQL"); 
		a1.add("WebTech"); 

		System.out.println("Original List :" + a1); 
		Collections.shuffle(a1);
		//new Random(5));
		System.out.println("Shuffled List :" + a1); 
		
		
		/*   output
		 For Linked List                                         
		 Original List :[Selenium, Manual, java, Phython, SQL, WebTech]
         Shuffled List :[Manual, WebTech, Phython, SQL, Selenium, java]
		  
		 For ArrayList
		 Original List :[Selenium, Manual, java, Phython, SQL, WebTech]
         Shuffled List :[WebTech, Manual, SQL, Selenium, java, Phython]
		     
	*/	
		
		
//-------------------6.Sorted Map---------
	 /*          //Not working for Linked Hashmap and Hashmap
		TreeMap tm= new TreeMap<>();
	//	HashMap tm= new HashMap<>();
		//LinkedHashMap tm= new LinkedHashMap<>();
		tm.put(1,"Pavan");
		tm.put(2,"das");
		tm.put(3,"Nik");
		tm.put(4,"shri");
		tm.put(5,"akshay");

		System.out.println("Treemap are="+tm);

		SortedMap s=tm.subMap(2,5);
		System.out.println(s);
		
		//output:
	//	Treemap are={1=Pavan, 2=das, 3=Nik, 4=shri, 5=akshay}
	//	{2=das, 3=Nik, 4=shri}
		
	*/
	
//--------------------7.sublist in Linked list and Iterator in descending order-----------------------------		
		                              //ArrayList not working
		
	  //	ArrayList l1= new ArrayList<>();
	  	LinkedList l1=new LinkedList();
		
		l1.add(5);                         //output
		l1.add(6);                         
		l1.add(8);
		l1.add(9);
		l1.add(109);
		l1.add(104);
		l1.add(102);
		System.out.println(l1.subList(2, 5)); //[8, 9, 109]
		Collections.reverse(l1);
		System.out.println(l1);  //[102, 104, 109, 9, 8, 6, 5]
		System.out.println(l1.peekFirst());  //102
		System.out.println(l1.peekLast());  //5
		Iterator it=l1.descendingIterator();
		{
			while(it.hasNext()) {
				System.out.print(it.next()); //5689109104102
			}
		}
		
		
		
//----------------------------------8.Tree set-------------------------		
	/*                            //Hash set and Linked Hash set not working
		SortedSet s=new TreeSet();
		s.add(6);
		s.add(8);
		s.add(9);
		s.add(5);
	System.out.println("Subset from 1to 6 are="+s.subSet(1, 3));	
  
	*/	
//----------------------------------9.swapping in ArrayList---------------		
	/*	                //Linked list working
		//ArrayList mylist = new ArrayList<>(); 
		LinkedList mylist= new LinkedList<>();
		mylist.add("code"); 
		mylist.add("practice"); 
		mylist.add("quiz"); 
		mylist.add("Selenium"); 

		System.out.println("Original List : \n" + mylist); 
		Collections.swap(mylist, 1, 2); 

		System.out.println("\nAfter swap(mylist, 1, 2) : \n"+ mylist); 
		Collections.swap(mylist, 3, 1); 

		System.out.println("\nAfter swap(mylist, 3, 1) : \n"+ mylist); 
		
	/*	
		//output for ArrayList
		Original List : 
			[code, practice, quiz, Selenium]

			After swap(mylist, 1, 2) : 
			[code, quiz, practice, Selenium]

			After swap(mylist, 3, 1) : 
			[code, Selenium, practice, quiz]
    
    
            Original List : 
           [code, practice, quiz, Selenium]

           After swap(mylist, 1, 2) : 
           [code, quiz, practice, Selenium]

            After swap(mylist, 3, 1) : 
            [code, Selenium, practice, quiz]
   
    */
		
//---------------------------10.synchronization map----------------
	/*	
	  //	TreeMap m= new TreeMap<>();
	  //	LinkedHashMap m= new LinkedHashMap<>();
		  HashMap m= new HashMap<>();
		
		m.put(1, 'a');
		m.put(2, 'b');
		m.put(3, 'c');
		System.out.println(m);
		Collections.synchronizedMap(m);
		System.out.println(m);
		
		/* output
		 *           same for TreeMap, Linked HashMap, Hash Map
		 * {1=a, 2=b, 3=c}
           {1=a, 2=b, 3=c}

		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
