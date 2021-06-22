package Collections;
import java.util.*;

public class ListStack //Child Class of Vector- Maily used for Search operation
{
	public static void main(String[] args) 
	{
		Stack s=new Stack(); 
		System.out.println("Stack is empty: "+s.isEmpty());
		s.push(1); //Adding only Stack specific methods here. Also We can use all the methods in List 
		s.push("Kusuma");
		s.push(20.2);
		s.push('D');
		//s.pop(); 
		System.out.println("Elements in the Stack are: "+s);
		System.out.println("Stack is empty: "+s.isEmpty());
		System.out.println("Element on the top of Stack with removal of element is: "+s.pop()); //Returns and Removes element at the top of stack
		System.out.println("Element on the top of Stack without removal of element is: "+s.peek()); //Returns the element at the top of stack without removing the element
		System.out.println("Position of element '20.2' in the Stack is: "+s.search(20.2)); //Returns position of the element- Top=1,Next=2
		System.out.println("Position of element '23' in the Stack is: "+s.search(23)); //Returns -1 if the element is not present
		
		Iterator itr=s.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		Enumeration e= s.elements(); //Only applicable for Legacy classes like Vector
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		ListIterator litr=s.listIterator(); //Only applicable List implementing classes
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
		System.out.println();
		
	}
}
