package Collections;
import java.util.*;

public class SetLinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("A"); // Set Doesn't contain any new method. We have to Use Collection interface methods only
		lhs.add("F");
		lhs.add('N');
		lhs.add(12);
		lhs.add(9.8);
		lhs.add(null);
		lhs.add(null);
		System.out.println("Elements in Linked HashSet: "+lhs);
		lhs.remove("F");
		lhs.remove(12);
		System.out.println("Elements in Linked Hashset after removal : "+ lhs); //Insertion order is preserved
		//lhs.add(2,"D"); //Error as it is List method
		lhs.remove(2); //No effect as it is list method
		lhs.add("A"); //Duplicates are not allowed
		System.out.println(lhs.add("A")); 
		
		Iterator itr=lhs.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Enumeration e= lhs.elements(); //Only applicable for Legacy classes like Vector
		
		//ListIterator litr=lhs.listIterator(); //Only applicable List implementing classes
	}
}
