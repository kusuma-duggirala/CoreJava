package Collections;
import java.util.*;
public class MapHashMap //Implements Map Interface- Not Synchronized
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap();
		hm.put(null,null); //Allows only 1 null Key
		hm.put(null,null); // No effect on this line as it allows only 1 null key
		hm.put(6,null); //Allows multiple null values
		hm.put(5,"Trimurtulu");
		hm.put(1,"Kusuma");
		hm.put(3,"Uday");
		hm.put(2,"Mounika");
		hm.put(4,"Varalakshmi");
		hm.put(5, "Varalakshmi");
		hm.put(7, "");
		System.out.println(hm);
		System.out.println(hm.get(5));
		System.out.println(hm.get(8)); //Returns null, If no value is mapped to the specified key
	
		//Enumeration e=(Enumeration) hm.keySet();
		Set<Integer> keys=hm.keySet();              //Here we are getting the Keys
		//for(Integer key: keys)
		for(Integer key: hm.keySet())
		{
			System.out.println("Key: "+key+" Value: "+hm.get(key));
		}
		
		Set<Map.Entry<Integer, String>> vals=hm.entrySet(); //Entry is an interface inside Map interface- Here getting the entry 
		//for(Map.Entry<Integer, String> e: vals)
		for(Map.Entry<Integer, String> e: hm.entrySet())
		{
			System.out.println("Key: "+e.getKey()+" Value: "+e.getValue());
		}
		
		Iterator itrk=hm.keySet().iterator();
		while(itrk.hasNext())
		{
			System.out.println("Keys: "+itrk.next());
		} 
		
		Iterator itrv=hm.values().iterator();
		while(itrv.hasNext())
		{
			System.out.println("Values: "+itrv.next());
		}
		

	}

}
