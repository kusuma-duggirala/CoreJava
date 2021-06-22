package Collections;
import java.security.AlgorithmConstraints;
import java.util.*;
public class ListArrayList //Implements List Interface- Not Synchronized
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(); //Default initial capacity is 10 and then the size grows @(1.5*CC)+1
		//List al= new ArrayList(5); //We can also give the initial capacity
		al.add(1);
		al.add("Kusuma");
		al.add(20.8);
		al.add("D");
		al.add(1,"Duggirala"); //index,element
		al.add('c');
		al.add(1);
		al.add("Kusuma");
		System.out.println("List elements: "+al);
		al.remove(3);
		System.out.println("List elements after removing the element at 3rd index: "+al);
		al.remove("D");
		System.out.println("List elements after removing 'D': "+al);
		al.set(1,"Dugg"); //replaces the current object
		System.out.println("List elements after replacing element at 1st index with 'Dugg': "+al);
		System.out.println("Index of first occurence of 'Kusuma': "+ al.indexOf("Kusuma")); //Index of first occurrence
		System.out.println("Index of first occurence of '2': "+al.indexOf(2)); //Returns -1 if the given object is not found
		System.out.println("Index of last occurence of '1': "+al.lastIndexOf(1)); // Index of last occurrence
		System.out.println("Index of last occurence of '2': "+al.lastIndexOf(2)); //Returns -1 if the given object is not found
		
		Iterator itr=al.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Enumeration e= al.elements(); //Only applicable for Legacy classes like Vector
		
		ListIterator litr=al.listIterator(); //Only applicable List implementing classes
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
