package StringFunctions;

public class ToString2 
{

	String name;
	int rollNum;
	ToString2(String name, int rollNum)
	{
		this.name=name;
		this.rollNum=rollNum;
		
	}
	public static void main(String[] args) 
	{
		ToString2 s2=new ToString2("asd",56);
		//System.out.println(s2); //ToString2@15db9742 - Output without toString() method
		System.out.println(s2);

	}
	
	//Overriding the toString() method in Object class
	public String toString()
	{
		return "Name: "+name+" Roll Num: "+rollNum;
		
	}

}
