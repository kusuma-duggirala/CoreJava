package Miscellaneous;

public class Swapping {

	public static void main(String[] args) 
	{
		int a=5;
		int b=3;
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		/*a=a-b;
		b=a+b;
		a=b-a;*/
		b=a+b-(a=b);
		System.out.println(a);
		System.out.println(b);

	}

}
