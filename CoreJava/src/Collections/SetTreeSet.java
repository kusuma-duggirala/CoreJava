package Collections;

import java.util.Set;
import java.util.TreeSet;

public class SetTreeSet 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		//ts.add(null); //Doubt
		ts.add(101);
		ts.add(231);
		ts.add(117);
		ts.add(816);
		ts.add(22);
		
		System.out.println("Elements in the TreeSet: "+ts);
		System.out.println("First Element in the Treeset is: "+ts.first());
		System.out.println("Last element in the Treeset is: "+ts.last());
		System.out.println("Elements in the Headset '117' of TreeSet: "+ts.headSet(117));
		System.out.println("Elements in the Tailset of '117' TreeSet: "+ts.tailSet(117));
		System.out.println("Elements in the Subset '101' and '231' of TreeSet: "+ts.subSet(101, 231));
		System.out.println(ts);
		ts.add("Kusu"); //ClassCast Exception
		ts.add(null);  //Null Pointer Exception
		

	}

}
