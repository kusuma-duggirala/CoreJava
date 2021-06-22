package Ploymorphysm;

public class SuperClass 
{

	SuperClass()
	{
		System.out.println("In Superclass Default Constructor");
	}
	SuperClass(int a)
	{
		System.out.println("In Superclass Parameterized Constructor");
	}
	public static void main(String[] args) 
	{
		
		//SubClass sc=new SubClass();
		SubClass sc=new SubClass(6);

	}

}

class SubClass extends SuperClass
{
	SubClass()
	{
		System.out.println("In Subclass Default Constructor");
	}
	
	SubClass(int a)
	{
		System.out.println("In Subclass Parameterized Constructor");
	}
}


