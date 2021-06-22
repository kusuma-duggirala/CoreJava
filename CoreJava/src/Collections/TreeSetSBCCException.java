package Collections;

import java.util.TreeSet;

public class TreeSetSBCCException 
{

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("L"));
		System.out.println(t);// ClassCastException as String Buffer does not implement Comparable interface.

	}

}
