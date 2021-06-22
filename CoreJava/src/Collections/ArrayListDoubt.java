package Collections;


import java.util.*;

public class ArrayListDoubt 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(3);
		al.add(1,4); //index,number-Add element 4 at first index
		al.add(2);
		al.add(5);
		System.out.println("List elements: "+al);
		al.remove(4);// Removing the value at 4th Index
		System.out.println("List elements after removing the element at 4th index: "+al);
		al.remove("2"); //Not working- Will only work for String elements
		System.out.println("List elements after removing element '2': "+al);
		Collections.sort(al);
		System.out.println("Sorted List: "+al);
	}
}

