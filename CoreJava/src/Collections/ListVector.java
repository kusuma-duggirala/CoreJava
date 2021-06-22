package Collections;
import java.util.*;
public class ListVector //Implements List Interface- Synchronized
{
	public static void main(String[] args) 
	{
		Vector v=new Vector(); //Default initial capacity is 10 and then size grows @(2*CC)
		System.out.println(v.capacity()); //10
		//Vector v=new Vector(5); //We can also give the initial capacity
		//Vector v =new Vector(5,2); //Initial Capacity, Incremental Capacity. We can also give the rate at which Vector should grow
		v.addElement(1); //Adding only Vector specific methods here. Also We can use all the methods in List 
		v.addElement("Kusuma"); 
		v.addElement(2.2);
		v.addElement('D');
		v.addElement(98);
		System.out.println("Elements in the Vector: "+v);
		v.removeElement(98);
		System.out.println("Elements in the Vector after removing element '98' is: "+v);
		v.removeElementAt(3);
		System.out.println("Elements in the Vector after removing element at 3rd index is: "+v);
		System.out.println("Element at 1st index is: "+v.elementAt(1));
		System.out.println("First Element in Vector is: "+v.firstElement());
		System.out.println("Last Element in Vector is: "+v.lastElement());
		/*v.removeAllElements();
		System.out.println("Vector after removing all the elements is: "+v);*/
		
		Iterator itr=v.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Enumeration e= v.elements(); //Only applicable for Legacy classes like Vector
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		ListIterator litr=v.listIterator(); //Only applicable List implementing classes
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		v.removeAllElements();
		System.out.println("Vector after removing all the elements is: "+v);

	}

}
