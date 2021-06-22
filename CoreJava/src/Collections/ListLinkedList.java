package Collections;
import java.util.*;

public class ListLinkedList //Implements List Interface-Not Synchronized
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.addFirst(1); //Adding only LinkedList specific methods here. Also We can use all the methods in List 
		ll.addFirst(2);
		ll.addFirst("Kusuma");
		ll.addLast("Duggirala");
		ll.addLast(20.8);
		ll.addLast('D');
		System.out.println("Linked List elements: "+ll);
		ll.removeFirst(); 
		System.out.println("Linked List elements after removing the first element: "+ll);
		ll.removeLast();
		System.out.println("Linked List elements after removing the last element: "+ll);
		System.out.println("First element of Linked List is: "+ll.getFirst());
		System.out.println("Last element of Linked List is: "+ll.getLast());
		
		Iterator itr=ll.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Enumeration e= l.elements(); //Only applicable for Legacy classes like Vector
		
		ListIterator litr=ll.listIterator(); //Only applicable List implementing classes
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
