package This;

public class StaticBlock 
{
	static String s="";
	//Static block is the first to execute before main method
	static
	{
		s="Hello World"; 
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Value of s: "+s);

	}
	
	

}
