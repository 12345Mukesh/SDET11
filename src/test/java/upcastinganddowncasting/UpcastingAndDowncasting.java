package upcastinganddowncasting;



public class UpcastingAndDowncasting {

	public static void main(String[] args) 
	{
		//upcasting---subclass properties calling to superclass and hiding subclass methods
		Police p1= new Boyfriend();
		p1.lockdown();
		
		
		//downcasting----converting upcasted object into normal form
	   Boyfriend p= (Boyfriend) p1;
	   p.lockdown();
	   p.meetinggirlfriend();
		
		
		
		
		
		
		
		
		
		
	}

}
