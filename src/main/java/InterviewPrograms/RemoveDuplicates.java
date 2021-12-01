package InterviewPrograms;

import java.util.Scanner;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
	//	String s1="Testingenesis";
//		String dup="";
//		for(int i=0;i<s.length();i++)
//		{
//			if(dup.indexOf(s.charAt(i))==-1)
//			{
//				dup=dup+s.charAt(i);
//			}
//		}
//       System.out.println(dup);

 //	<---------------------------------------------------------------------------------------------------->	
	//For checking string values	
		//to check ascii values
	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter string value");
		String s1=s.nextLine();
		char []ch=s1.toCharArray(); 
	   for(int i=0;i<ch.length;i++)
	   {
		   int count=1;
		   for(int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j])
			   {
				   count++;
				   ch[j]=0;
			   }
			   
		   }
	   
	       if(ch[i]!=0)
	       {
	    	   System.out.print(ch[i]+" ");
	       }
	   
	   }
	 
	   
	   
	 
	//<------------------------------------------------------------------------------->
		//For int values
/*		
	   int[] ch= {1,5,7,5,6,2,3,2,6};
		
	   for(int i=0;i<ch.length;i++)
	   {
		   int count=1;
		   for(int j=i+1;j<ch.length;j++)
		   {
			   if(ch[i]==ch[j])
			   {
				   count++;
				   ch[j]=0;
			   }
			   
		   }
	   
	       if(ch[i]!=0)
	       {
	    	   System.out.println(ch[i]+" ");
	       }
	   
	  }
	*/	
		
	}   
	   	
}
