package This;

public class ConstructorOverload 
{

	/*ConstructorOverload(int a)
	{
		System.out.println("In Integer");
	}
	*/
	
	ConstructorOverload(double a)
	{
		System.out.println("In Double");
	}
	
	public static void main(String[] args) 
	{
		ConstructorOverload co=new ConstructorOverload(5);
		//ConstructorOverload co=new ConstructorOverload(5.5);

	}

}
