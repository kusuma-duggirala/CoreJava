package Collections;
import java.util.*;

public class SetHashset //Implements Set Interface
{
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("A"); // Set Doesn't contain any new method. We have to Use Collection interface methods only
		hs.add("F");
		hs.add('N');
		hs.add(12);
		hs.add(9.8);
		hs.add(null);
		System.out.println("Elements in HashSet: "+hs);
		hs.remove("F");
		hs.remove(12);
		System.out.println("Elements in Hashset after removal : "+ hs);
		//h.add(1,"Z"); // Error as it is List method and also Index is not fixed as insertion order is not preserved 
		hs.remove(1); // List method, Can't use and We can't depend on Index as insertion order is not preserved
		hs.add("A");
		System.out.println(hs.add("A")); //Duplicates are not allowed
		System.out.println(hs); //Insertion order is not preserved
		
		Iterator itr=hs.iterator(); //Universal Cursor, Applicable for entire Collection
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Enumeration e= h.elements(); //Only applicable for Legacy classes like Vector
		
		
		//ListIterator litr=h.listIterator(); //Only applicable List implementing classes
	}
}
