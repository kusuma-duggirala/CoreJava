package StringFunctions;
//int, float, double, char- Primitive
//Integer, Float, Double, Character- Wrapper/Objects
public class WrapperClass 
{

	public static void main(String[] args) 
	{
		int i=5;
		//Integer obj=new Integer(i); //Wrapping or Boxing
		Integer obj=Integer.valueOf(i); //Wrapping or Boxing
		System.out.println(obj);
		int j=obj.intValue(); //Unwrapping or Unboxing
		System.out.println(j);
	}

}
