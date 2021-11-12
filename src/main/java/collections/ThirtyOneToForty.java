package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map.Entry;

public class ThirtyOneToForty {

	public static void main(String[] args) 
	{
	
//------------------1.ArrayList cloning--------------------		
	/*	
		// Creating an empty ArrayList
        ArrayList<String> list
            = new ArrayList<String>();
  
        // Use add() method
        // to add elements in the list
        list.add("Hello");
        list.add("for");
        list.add("Geeks");
        list.add("10");
        list.add("20");
  
        // Displaying the list
        System.out.println("First ArrayList: "
                           + list);
  
        // Creating another linked list and copying
        ArrayList sec_list = new ArrayList();
        sec_list = (ArrayList)list.clone();
  
        // Displaying the other linked list
        System.out.println("Second ArrayList is: "
                           + sec_list);
		
        
      /*output:  
        First ArrayList: [Hello, for, Geeks, 10, 20]
        Second ArrayList is: [Hello, for, Geeks, 10, 20]
        
  */      
        
//-------------------2.copy ArrayList to Array---------------------
   /*     
		 ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Actual ArrayList:"+arrl);
	        String[] strArr = new String[arrl.size()];
	        arrl.toArray(strArr);
	        System.out.println("Created Array content:");
	        for(String str:strArr){
	            System.out.println(str);
	        }
       System.out.println(strArr);
	
    /* output   
       Actual ArrayList:[First, Second, Third, Random]
       Created Array content:
       First
       Second
       Third
       Random
       strArr size in the form of alphanumeric:[Ljava.lang.String;@dcf3e99

       
       
	*/	
	
//------------------------3.ArrayList checking-------------------------------
	/*	
		 ArrayList<String> arrl = new ArrayList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        List<String> list = new ArrayList<String>();
	        list.add("Second");
	        list.add("Random");
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
	        list.add("one");
	        System.out.println("Does ArrayList contains all list elements?: "
	                    +arrl.containsAll(list));
		
/* output
 * 
 * Does ArrayList contains all list elements?: true
   Does ArrayList contains all list elements?: false		
 */
		
//-------------------------4.copy Linked list to Array--------------------------------		
	/*	
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
	/* output	
		Actual LinkedList:[First, Second, Third, Random]
        Created Array content:
        First
        Second
        Third
        Random
	*/	
		
		
//---------------5.copy Hash set to Another Hash set-----------------------------------
     /*   
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
		
	/* output	
		
		[third, first, second]
        HashSet content after adding another collection:
        [third, first, s1, second, s2]

  */		
		
//---------------------6.copy Hashmap to Another Hashmap----------------------
	/*	
		 HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        HashMap<String, String> subMap = new HashMap<String, String>();
	        subMap.put("s1", "S1 VALUE");
	        subMap.put("s2", "S2 VALUE");
	        hm.putAll(subMap);
	        System.out.println(hm);
		
/* output		
		
		{third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
        {third=THIRD INSERTED, first=FIRST INSERTED, s1=S1 VALUE, second=SECOND INSERTED, s2=S2 VALUE}
*/
		
		
//--------------------------7.sublist from ArrayList---------------------------		
	/*	
		 ArrayList<String> arrl = new ArrayList<String>();
	        //adding elements to the end
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        arrl.add("Click");
	        System.out.println("Actual ArrayList:"+arrl);
	        List<String> list = arrl.subList(2, 4);
	        System.out.println("Sub List: "+list);
		
   /* output		
		Actual ArrayList:[First, Second, Third, Random, Click]
        Sub List: [Third, Random]
  */
		
//--------------------------8.Read First Element from Linked List------------------------
	/*	
		LinkedList<String> arrl = new LinkedList<String>();
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("First Element: "+arrl.element());
        System.out.println("First Element: "+arrl.getFirst());
        System.out.println("First Element: "+arrl.peek());
        System.out.println("First Element: "+arrl.peekFirst());
        
   /* output
    * 
    *  First Element: First
       First Element: First
       First Element: First
       First Element: First   
    */
        
//--------------------9.Read Last Element from Linked List---------------------        
   /*     
		 LinkedList<String> arrl = new LinkedList<String>();
	        arrl.add("First");
	        arrl.add("Second");
	        arrl.add("Third");
	        arrl.add("Random");
	        System.out.println("Last Element: "+arrl.getLast());
	        System.out.println("Last Element: "+arrl.peekLast());
	        
	 /* output       
		
		Last Element: Random
        Last Element: Random
*/
		
		
//------------------10.search key in Hash map----------------------
	/*
		HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        if(hm.containsKey("fifth")){
	            System.out.println("The hashmap contains key fifth");
	        } else {
	            System.out.println("The hashmap does not contains key fifth");
	        }
	        if(hm.containsKey("third")){
	            System.out.println("The hashmap contains key third");
	        } else {
	            System.out.println("The hashmap does not contains key third");
	        }
	        
	  /* output
	   * 
	   *    {third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
            The hashmap does not contains key fifth
            The hashmap contains key third
   
	   *       
	   *       
	   */
//----------------11.search value in Hash map----------------------------- 	        
		
	/*	
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
		
	/*output	
		
		{third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
        The hashmap contains value SECOND INSERTED
        The hashmap does not contains value first
   */
		
//-------------------------12. search All keys in Hash map---------------------------
	/*	
		
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println(key);
        } 
            
	/* output	
		
		{third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
        [third, first, second]
        third
        first
        second
		
   */		
		
		
//---------------------------13.search key in linked hash map---------------------------		
	/*	
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
        if(hm.containsKey("third")){
            System.out.println("The hashmap contains key third");
        } else {
            System.out.println("The hashmap does not contains key third");
        }
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        The hashmap does not contains key fifth
         The hashmap contains key third
    */
//--------------------14. search value in linked hash map-------------------		
	/*	
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        The hashmap contains value SECOND INSERTED
        The hashmap does not contains value first
   */		
		
//---------------------------15. search key in tree map----------------------		
	 /*	
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("fifth")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
        if(hm.containsKey("third")){
            System.out.println("The hashmap contains key third");
        } else {
            System.out.println("The hashmap does not contains key third");
        }
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        The hashmap does not contains key fifth
        The hashmap contains key third
  */

//---------------------------16. search value in tree map-------------------		
		
	/*	
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsValue("SECOND INSERTED")){
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap does not contains value SECOND INSERTED");
        }
        if(hm.containsValue("first")){
            System.out.println("The hashmap contains value first");
        } else {
            System.out.println("The hashmap does not contains value first");
        }
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
       The hashmap contains value SECOND INSERTED
       The hashmap does not contains value first
  */
		
//---------------------------17.get all keys from linked hash map-----------------		
	/*	
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println(key);
        } 
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        [first, second, third]
         first
        second
        third
*/
		
		
//-----------------------18. get all keys from tree map----------------
	/*	
		
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String key: keys){
            System.out.println(key);
        } 
		
/* output:
 * 
 * {first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
   [first, second, third]
   first
   second
   third

 * 		
 */
		
//--------------------19.Delete all elements from hash map------------------------------
	/*
		
		HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
  /* output:
		My HashMap content:
       {third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
       Clearing HashMap:
       Content After clear:
       {}
*/

//------------------------20. Delete all elements from Linked hash map-------------------
		
/*		
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My Linked HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
		
/* output		
		
		My Linked HashMap content:
        {first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        Clearing HashMap:
        Content After clear:
        {}
*/
		
//----------------------------21.Delete all element as tree map-------------------	
		
/*		
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println("My Tree HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
		
/* output
 * 
 * My Tree HashMap content:
  {first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
   Clearing HashMap:
   Content After clear:
   {}

 * 		
 */
//-------------------22.Entry set from Hash map--------------------- 		
/*		
		 HashMap<String, String> hm = new HashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        //getting value for the given key from hashmap
	        Set<Entry<String, String>> entires = hm.entrySet();
	        for(Entry<String,String> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
		
/* output		
		
		{third=THIRD INSERTED, first=FIRST INSERTED, second=SECOND INSERTED}
         third ==> THIRD INSERTED
         first ==> FIRST INSERTED
         second ==> SECOND INSERTED
*/ 
		
//--------------------23.Entry set from Linked Hash map-----------------------
  /*		
		 LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
	        //add key-value pair to hashmap
	        hm.put("first", "FIRST INSERTED");
	        hm.put("second", "SECOND INSERTED");
	        hm.put("third","THIRD INSERTED");
	        System.out.println(hm);
	        //getting value for the given key from hashmap
	        Set<Entry<String, String>> entires = hm.entrySet();
	        for(Entry<String,String> ent:entires){
	            System.out.println(ent.getKey()+" ==> "+ent.getValue());
	        }
/* output		
		
	{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
    first ==> FIRST INSERTED
    second ==> SECOND INSERTED
    third ==> THIRD INSERTED
*/	
		
//----------------------------24. Entry set from Tree map----------		
	/*	
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        Set<Entry<String, String>> entires = hm.entrySet();
        for(Entry<String,String> ent:entires){
            System.out.println(ent.getKey()+" ==> "+ent.getValue());
        }
		
	/* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        first ==> FIRST INSERTED
        second ==> SECOND INSERTED
        third ==> THIRD INSERTED
*/
		
//--------------------25. copy linked hash map to another linked hash map-----------------------------		
		/*
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
	
        /* output	
		
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        {first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED, s1=S1 VALUE, s2=S2 VALUE}
      */
		
//----------------------26. copy tree map to another tree map---------------------------------
	 /*	
		TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
		
	/*output:	
		{first=FIRST INSERTED, second=SECOND INSERTED, third=THIRD INSERTED}
        {first=FIRST INSERTED, s1=S1 VALUE, s2=S2 VALUE, second=SECOND INSERTED, third=THIRD INSERTED}
     */
		
//----------------------27. copy linked hash set to another linked hash set------------------- 		
	  /*	
		 LinkedHashSet<String> hs = new LinkedHashSet<String>();
	        //add elements to HashSet
	        hs.add("first");
	        hs.add("second");
	        hs.add("third");
	        System.out.println(hs);
	        HashSet<String> subSet = new HashSet<String>();
	        subSet.add("s1");
	        subSet.add("s2");
	        hs.addAll(subSet);
	        System.out.println("LinkedHashSet content after adding another collection:");
	        System.out.println(hs);
	
	 /* output:	
		[first, second, third]
        LinkedHashSet content after adding another collection:
        [first, second, third, s1, s2]
   */
		
//--------------------------28. copy tree set to another tree set-------------------		
	/*	
		TreeSet<String> hs = new TreeSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<String>();
        subSet.add("s1");
        subSet.add("s2");
        hs.addAll(subSet);
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(hs);
        
    /*output:
     * [first, second, third]
        LinkedHashSet content after adding another collection:
        [first, s1, s2, second, third]
    
     */
        
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
