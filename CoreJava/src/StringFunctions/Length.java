package StringFunctions;

public class Length 
{
	static String s="Kusuma";
	static int count=0;
	public static void main(String[] args) 
	{
		int i=0;
		try
		{
			while(s.charAt(i)!=' ')
			{
				count++;
				i++;
				//System.out.println(i);
				//System.out.println(count);
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		
		/*char[] ch=s.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		*/
		
		System.out.println("Length is "+count);
	}
		
}


