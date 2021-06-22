package Exceptions;

public class NullPointerExc 
{

	public static void main(String[] args) 
	{
		String str = "";
		String str2=null;
		System.out.println(str.length()); //0
		System.out.println(str.charAt(0)); //String index out of range
		System.out.println(str2.length()); //Null Pointer Exception

	}

}
