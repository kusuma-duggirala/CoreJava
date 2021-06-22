package Interface;

public class ClassMI 
//implements MarkerInterface
{

	public static void main(String[] args) 
	{
		ClassMI cmi=new ClassMI();
		if(cmi instanceof MarkerInterface )
		{
			cmi.show();
		}
		System.out.println("Done");

	}
	
	public void show()
	{
		System.out.println("Show");
	}

}
