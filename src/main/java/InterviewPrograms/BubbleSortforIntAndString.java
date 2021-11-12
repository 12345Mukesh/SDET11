package InterviewPrograms;

public class BubbleSortforIntAndString
{
	public static void main(String args[])
	{
		int [] arr= {3,6,5,8,7,};
  // char [] arr= {'q','r','e','y','l','c'};
   
   for(int i=0;i<arr.length;i++)
   {
	  for(int j=i+1;j<arr.length;j++)
	  {
		  if(arr[i]<arr[j])
		  {
			 int temp=arr[i];
			//  char temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
		  }
	  }
	   
   }
	
   
   for(int i=0;i<arr.length;i++)
   {
	   System.out.print(arr[i]+",");
   }
   
   
	
	}	
	
}
