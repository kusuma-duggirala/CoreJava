package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapLinkedHashMap 
{

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap();
		lhm.put(null,null); //Allows only 1 null Key
		lhm.put(null,null); // No effect on this line as it allows only 1 null key
		lhm.put(6,null); //Allows multiple null values
		lhm.put(5,"Trimurtulu");
		lhm.put(1,"Kusuma");
		lhm.put(3,"Uday");
		lhm.put(2,"Mounika");
		lhm.put(4,"Varalakshmi");
		lhm.put(5, "Varalakshmi");
		lhm.put(7, "");
		System.out.println(lhm);
		System.out.println(lhm.get(5));
		System.out.println(lhm.get(8));
		
		Set<Integer> keys=lhm.keySet();
		//for(Integer key:keys)
		for(Integer key: lhm.keySet())
		{
			System.out.println("Key: "+key+" Value: "+lhm.get(key));
		}
		
		Set<Map.Entry<Integer, String>> vals=lhm.entrySet();
		//for(Map.Entry<Integer, String> e: vals)
		for(Map.Entry<Integer, String> e: lhm.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
		
		Iterator itrk=lhm.keySet().iterator();
		while(itrk.hasNext())
		{
			System.out.println("Keys: "+itrk.next());
		}
		
		Iterator itrv=lhm.values().iterator();
		while(itrv.hasNext())
		{
			System.out.println("Values: "+itrv.next());
		}

	}

}
