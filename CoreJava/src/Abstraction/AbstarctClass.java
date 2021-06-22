package Abstraction;

abstract class AbstarctClass 
{
	AbstarctClass() //Constructor concept is applicable
	{
		
	}
	
	public void show()
	{
		System.out.println("Show");
	}
	
	public void display()
	{
		System.out.println("Display");
	}
	
	//public abstract void ready();  //We can make the class as abstract without having abstract methods in it.
	
	public static void main(String[] args)
	{
		//AbstarctClass ab=new AbstarctClass(); //Cannot create object
	}
}
