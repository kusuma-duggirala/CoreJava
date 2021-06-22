package This;

//Can be used to invoke the current class constructor from default constructor
public class Constructor 
{

	int a;
	int b;
	
	Constructor()
	{
		this(2,3);  
		System.out.println("Default Constructor");
		//this(2,3);  //Constructor call must be the first statement in a constructor
	}
	
	Constructor(int a, int b)
	{
		System.out.println("Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Constructor cons = new Constructor();
	

	}

}
