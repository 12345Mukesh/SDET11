package InterviewPrograms;

public class LongestAlphabetAlsoHighest {

	public static void main(String[] args) 
	{
	     String s1="alphabet consist of multiple abcdefghijklmn values";
	     String[] str= s1.split(" ");
	     
	     int maxlength=0;
	     String word=" ";
	     int secondmax=0;
	     
	     for(int i=1;i<str.length;i++)
	     {
	    	 if(maxlength<str[i].length())
	    	 {
	    		secondmax=maxlength;
	    		
	    		 maxlength=str[i].length();
	    		 word=str[i];
	    		 	    		
	    	 } 
	    	 else if(maxlength>str[i].length())
	    	 {
	    		
	    		 secondmax=str[i].length(); 
	    		 word=str[i];
	    		
	    	 }
	     
	     
	     }
		
	     System.out.println(maxlength+"  "+word);
	     System.out.println(secondmax+"  "+word);
	}

}
