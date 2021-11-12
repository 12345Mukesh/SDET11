package InterviewPrograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) 
	{
		String s1="madam";
		String s2="maadM";
		if(s1.length()==s2.length())
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
		
		

	}

}
