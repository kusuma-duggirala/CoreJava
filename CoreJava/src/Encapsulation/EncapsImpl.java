package Encapsulation;

public class EncapsImpl 
{

	public static void main(String[] args) 
	{
		PrivateClass pc=new PrivateClass();
		pc.setI(5);
		System.out.println(pc.getI());//5

	}

}
