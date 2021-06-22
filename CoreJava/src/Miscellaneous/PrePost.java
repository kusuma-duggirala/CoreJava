package Miscellaneous;

public class PrePost {

	public static void main(String[] args) 
	{
		int i=5, j=6, k=9;
		/*i=i++;
		j=++j;*/
		int c=k++;
		System.out.println(i++); //5
		System.out.println(i); //6
		System.out.println(++j); //7
		System.out.println(c+" "+k); //9 10

	}

}
