package InterviewPrograms;

public class BubbleSortforIntAndString
{
	public static void main(String args[])
	{
		int [] arr= {3,6,5,8,7,3,5,2,1,4,3,5,6};
 // char [] arr= {'q','r','e','y','l','c','a','z','r','k'};
   
   for(int i=0;i<arr.length;i++)
   {
	   int count=0;
	  for(int j=i+1;j<arr.length;j++)
	  {
		  if(arr[i]>arr[j])
		  {
			int temp=arr[i];
			 // char temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
	     if(arr[i]==arr[j])
	     {
	    	 arr[j]=0;
	    	 count++;
	     }
	  }
	   
   }
	for(int i=0;i<arr.length;i++)
	{
		 if(arr[i]!=0)
		   {
			   System.out.print(arr[i]+" ");
		   }
	}
	
	}	
	
}
