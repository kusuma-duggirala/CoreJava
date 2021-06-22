package StringFunctions;

public class ToString //extends Object
{

	String name;
	int rollNum;
	
	ToString(String name,int rollNum)
	{
		this.name=name;
		this.rollNum=rollNum;
	}
	
	public static void main(String[] args) 
	{
		ToString s1=new ToString("kusu",15);
		System.out.println(s1); //getClass().getName() + "@" + Integer.toHexString(hashCode());

	}

}
