package This;

public class StaticImpl 
{

	int num1;
	static int num2;
	public static void main(String[] args) 
	{
		StaticImpl obj1=new StaticImpl();
		StaticImpl obj2=new StaticImpl();
		StaticImpl obj3=new StaticImpl();
		
		obj1.num1=2;
		obj2.num1=3;
		obj3.num1=4;
		StaticImpl.num2=9;
		
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		System.out.println(obj3.num1);
		System.out.println(num2);
		
		obj1.num2=2;
		obj2.num2=3;
		obj3.num2=4;
		
		System.out.println(obj1.num2);
		System.out.println(obj2.num2);
		System.out.println(obj3.num2);
		
		


	}

}
