package StaticNonStatic;

public class NoOfObjects 
{
	int i;
	static int j;
	NoOfObjects()
	{
		
		i++;
		j++;
		System.out.println("Value of i "+i);
		System.out.println("Value of j "+j);
	}
	public static void main(String[] args) 
	{
		
		NoOfObjects obj1=new NoOfObjects();
		NoOfObjects obj2=new NoOfObjects();
		NoOfObjects obj3=new NoOfObjects();
		NoOfObjects obj4=new NoOfObjects();
		NoOfObjects obj5=new NoOfObjects();
		obj1.count();
		

	}
	void count()
	{
		
		System.out.println(i);
		System.out.println(j);
	}
	
	

	

	

}
