package ProtPackage2;

import ProtPackage1.ProtClass1;

public class ProtClass2 extends ProtClass1
{

	public static void main(String[] args) 
	{
		//ProtClass1 pc1= new ProtClass1();
		//pc1.i;
		//pc1.show();
		
		ProtClass2 pc2=new ProtClass2();
		pc2.show2();
	}
	public void show2()
	{
		show();
		System.out.println(i);
	}

}
