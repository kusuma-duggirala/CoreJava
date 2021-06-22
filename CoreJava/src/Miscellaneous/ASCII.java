package Miscellaneous;

import javax.jws.soap.SOAPBinding;

public class ASCII {

	public static void main(String[] args) 
	{
		for(int i=0;i<128;i++)
		{
			//System.out.printf("%d : %c \n",i,i);
			System.out.println(i+" "+(char)i);
			
		}

	}

}
