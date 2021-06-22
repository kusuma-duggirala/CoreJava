package StringFunctions;

import java.util.Scanner;

public class ScannerRead 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i);
		Scanner sc2=new Scanner(System.in);
		String s1=sc2.nextLine();
		System.out.println(s1);
		Scanner sc3=new Scanner(System.in);
		String s2=sc3.nextLine();
		int j=Integer.parseInt(s2); //Convert Integer to String
		System.out.println(j);

	}

}
