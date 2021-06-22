package Exceptions;

public class UDExceptionImpl 
{

	public static void main(String[] args) 
	{
		try {
			throw new UserDefinedException("Custom Exception");
			
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e); //Exceptions.UserDefinedExceptionExceptions.UserDefinedException: Custom Exception
			System.out.println(e.getMessage()); //Custom Exception
		}
		
		try {
			throw new UserDefinedException();
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e); //Exceptions.UserDefinedException
			System.out.println(e.getMessage()); //null
		}
		
		
		throw new ArithmeticException(); //Can throw the existing exceptions also using throw keyword
		

	}

}
