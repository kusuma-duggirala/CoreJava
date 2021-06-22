package Collections;
import java.util.*;

public class MapHashTable //Implements Map Interface- synchronized, Inherits Dictionary Class  Dictionary->Hashtable->Properties
{

	public static void main(String[] args) 
	{
		Hashtable<Integer,String> ht=new Hashtable();
		//ht.put(null,null); //NULL Key insertion is not possible-Null Pointer Exception
		//ht.put(3,null); //NULL value insertion is not possible- Null Pointer Exception
		ht.put(2,"Trimurtulu");
		ht.put(1,"Kusuma");
		ht.put(1,"Varalakshmi");
		//ht.put(5, 10);      
		//ht.put("dd", "gg"); 
		ht.put(6, "");
		System.out.println(ht);
		System.out.println(ht.get(1));
		System.out.println(ht.get(5));
		ht.remove(6);
		System.out.println(ht);
		
		Set<Integer> keys=ht.keySet();
		//for(Integer key:keys)
		for(Integer key: ht.keySet())
		{
			System.out.println("Key: "+key+" Value: "+ht.get(key));
		}
		
		Set<Map.Entry<Integer, String>> entry=ht.entrySet();
		//for(Map.Entry<Integer, String> e: entry)
		for(Map.Entry<Integer, String> e: ht.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
		
		Enumeration e=ht.elements(); //Applicable for Legacy classes
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		Iterator itrk= ht.keySet().iterator();
		while(itrk.hasNext())
		{
			System.out.println(itrk.next());
		}
		
		Iterator itrv= ht.values().iterator();
		while(itrv.hasNext())
		{
			System.out.println(itrv.next());
		}
	}

}
