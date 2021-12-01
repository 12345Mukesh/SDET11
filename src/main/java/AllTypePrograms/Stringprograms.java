package AllTypePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Stringprograms {

	public static void main(String[] args)
	{
	
		//1.Anagram
		/*
		 Scanner s= new Scanner(System.in );
		System.out.println("Enter the first string");
		String s1=s.nextLine();
		Scanner s3= new Scanner(System.in );
		System.out.println("Enter the second string");
		String s2=s3.nextLine();
//		String s1="madam";
//		String s2="maadM";  
	    s1=s1.toLowerCase();
	    s2= s2.toLowerCase();
		if(s1.length()==s1.length())
		{
		char[] ch=s1.toCharArray();
		char[] ch1=s2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		if(Arrays.equals(ch, ch1)==true)
		 {
			System.out.println("Both the strings are Anagram");
		  }
		
		else
		{
			System.out.println("Not a anagram");
		}
		
		}	
		
		
		else
		{
			System.out.println("Not a anagram");
		}
		 
		*/
		//2. Panagram
		/*
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String:");
		String str=sc.nextLine();

		// replaceALL()-->replaces all spaces between strings
		//toLowerCase()->method which converts all characters to lower case
		str=str.toLowerCase();

		// empty string
		String s="";

		// checking characters (a-z or A-Z)
		for(char i='a';i<='z';i++)
		{
			//indexOf(char i)--> This method returns '-1' substring not found, if the position of substrings 'i' in 'str'
			if(str.indexOf(i)!=-1)
			{
				s=s+i;// empty string+character
			}
		}
		// s.length()-->this method returns number or character of a string
		if(s.length()==26){
			System.out.println("Pangram");
		}
		else{
			System.out.println(" Not Pangram");
		}
		 */
   		
	    //3.Palindrome
		/* 
		 boolean flag= true;
		//Convert the given string into lowercase
		Scanner s= new Scanner(System.in );
		System.out.println("Enter the first string");
		String str = s.nextLine();
		String string= str.toLowerCase();
		
		for(int i=0; i<string.length()/2;i++)
		{
		   if(string.charAt(i)!=string.charAt(string.length()-1))
		   {
		    flag = false;
		    break;
	    	}
		}
		       if(flag)
		      System.out.println("Given string is palindrome");
		       else
		      System.out.println("Given string is not a palindrome);
		      
		      
		       
		 */

		//4.Reverse the string
		/*
		 Scanner s= new Scanner(System.in );
		System.out.println("Enter the first string");
		String str = s.nextLine();
		String s2="";
		for(int i=str.length()-1;i>=0;i-- )
		{
			s2=s2+str.charAt(i);
		}
	  System.out.println("Reverse of String is:"+s2);
		 */
		
		
		
	//5.Reverse the sentence and letters of string
		/*
		 Scanner s= new Scanner(System.in );
		System.out.println("Enter the first string");
		String str = s.nextLine();
		String s2="";
		for(int i=str.length()-1;i>=0;i-- )
		{
			s2=s2+str.charAt(i);
		}
	  System.out.println("Reverse of String is:"+s2);
	*/	
		
		
	//6. counting occurence of words in string	
    /*  	
		 int count1;
		 Scanner s= new Scanner(System.in );
			System.out.println("Enter the first string");
			String k = s.nextLine();
		//String s1= "my country is my mom and i love my mom";
		String str[]=k.split(" ");
		String s2="";
		
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
     */  	  

		

	//7.counting no of letters in string
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter the string");	
	 String	string=sc.nextLine();
		int count = 0;    
       //Counts each character except space    
       for(int i = 0; i < string.length(); i++) {    
           if(string.charAt(i) != ' ')    
               count++;    
       }    
           
       //Displays the total number of characters present in the given string    
       System.out.println("Total number of characters in a string: " + count);    
		
	*/	
		
		
		
  //8.counting occurence of letters 
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	string");	
	 	 String	word1=sc.nextLine();	
	 	  String word=word1.toLowerCase();
		 int wordcount=0;
		
		for (char letter = 'a'; letter <= 'z'; letter++) 
		{
			for (int i = 0; i < word.length(); i++)
			{
				if (word.charAt(i) == letter) 
				{
					wordcount++;
				}
			}
			if (wordcount > 0) {
				System.out.println(letter + "=" + wordcount);
				wordcount=0;
			}
		}
    */
     		
	//9. sum of numbers in alphanumeric string	
     
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	alpha	numeric	string");	
	 String	str=sc.nextLine();	
	 char[]	ch=str.toCharArray();	
	 int	j=0;	
	 for(int	i=0;i<ch.length;i++)	
	 {	
	 	 if(ch[i]>=48 && ch[i]<=57)	
	 	 {	
	 	
	 	 	 j+=ch[i]-48;
	 	 }	
	 }	
	 	 System.out.println(j);	
	*/	
		
//10.Display the number of uppercase,lowercase,numbers and spaces		
		
		/*
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	string");	
	 	 String	st=sc.nextLine();	
	 	 char	ch[]=st.toCharArray();	
	 	 int	uc=0,lc=0,spc=0,dc=0,sp=0;	
	 	 for	(int	i=0;i<ch.length	;i++	)	
	 	 {	
	 	 	 if	(ch[i]>=65&&ch[i]<=90)	
	 	 	 {	uc++;	
	 	 	 }	
	 	 	 else	if	(ch[i]>=97&&ch[i]<=122)	
	 	 	 {	
	 	 	 	 lc++;	
	 	 	 }	
	 	 	 else	if	(ch[i]>=48&&ch[i]<=57)	
	 	 	 	 dc++;	
	 	 	 else	
	 	 	 	 if(ch[i]=='	')	
	 	 	 	 sp++;	
	 	 	 else	spc++;	
	 	 }	
	 	 System.out.println("no	:of	upper	case	letter	"+uc);	
	 	 System.out.println("no:	of	lower	case	letter"	+lc);	
	 	 System.out.println("no:	of	decimal	number"	+dc);	
	 	 System.out.println("no:	of	spaces	"+sp);	
	 	 System.out.println("no:	of	special	characters"	+spc);	
		
		*/
   //11.upper case to lower case and lower case to  uppercase
		
	/*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	string");	
	 	 String	st=sc.nextLine();	
	 	 char	ch[]=st.toCharArray();	
	 	 for	(int	i=0	;i<ch.length;i++	)	
	 	 {	
	 	 	 	 if	(ch[i]>=65&&ch[i]<=90)	
	 	 	 	 {	
	 	 	 	 	 ch[i]=(char)(ch[i]+32);	
	 	 	 	 }	
	 	 	 	 else	if	(ch[i]>=97&&ch[i]<=122)	
	 	 	 	 {	
	 	 	 	 	 ch[i]=(char)(ch[i]-32);	
					
	 	 	 	 }	
				
	 	 }	
	 	 	 st=new	String(ch);	
           System.out.println("converted String in	Case:"+st);
    	*/
	
		
//12.Removing spaces
	  /*	
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	string");	
	 	 String	st=sc.nextLine();	
	 	 String[] s=st.split(" ");
  		  for(int i=0;i<s.length;i++ )
  		  {
  			System.out.print(s[i]);  
  		  }
		*/
		
//13. Enter the character and checking in the string
	/*	
		int count=0;
		Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter	the	string");	
	 	 String	st=sc.nextLine();
	 	 char[] c1=st.toCharArray();
	 	 String s="mukesh";
	 	 char c[]=s.toCharArray();
	 	 for(int i=0;i<c.length;i++ )
 		  {
	 		 if(c1[i]==c[i])
	 		 {
	 			 count++;
	 		 }
 		  }
		System.out.println(count);
		
	*/	
		
		
	}

}
