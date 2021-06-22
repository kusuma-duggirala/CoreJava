package StringFunctions;

import java.io.IOException;
//System.in.read() Takes only single character for reading. For Strings, should use InputBufferedReader/Scanner
public class SystemRead 
{

	public static void main(String[] args) throws IOException 
	{
		
		int i=System.in.read(); //Return type is int and throws IO Exception
		System.out.println(i); //ASCII of i
		System.out.println((char)i);
		String str="";
		while((i=System.in.read())!=48)
		{
			str+=(char)i;
		}
		System.out.println(str);

	}

}
