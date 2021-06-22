package StaticNonStatic;

public class Static 
{

	static int wheels=4;
	public static void main(String[] args) 
	{
		 System.out.println(Static.wheels);
		 wheels=8;
		 System.out.println(Static.wheels);

	}

}
