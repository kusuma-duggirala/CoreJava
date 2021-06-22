package Collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTreeMap 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tm=new TreeMap();
		//tm.put(null,null); //NULL insertion is not possible-Null Pointer Exception
		tm.put(3,null); //Allows multiple null values
		tm.put(4, null);
		tm.put(2,"Trimurtulu");
		tm.put(1,"Kusuma");
		tm.put(1,"Varalakshmi");
		//tm.put(5, 10);      //Values are printed according to the sorted order of keys
		//tm.put("dd", "gg"); //ClassCast Exception- Keys should be homogeneous
		tm.put(6, "");
		System.out.println(tm);
		System.out.println(tm.get(1));
		System.out.println(tm.get(8));
		
		Set<Integer> keys=tm.keySet();
		for(Integer key: keys)
		{
			System.out.println("Keys: "+key+" Value: "+tm.get(key));
		}
		
		Set<Map.Entry<Integer, String>> entry=tm.entrySet();
		for(Map.Entry<Integer, String> e: entry)
		{
			System.out.println("Keys: "+e.getKey()+" Values: "+e.getValue());
		}
		
		Iterator itrk=tm.keySet().iterator();
		while(itrk.hasNext())
		{
			System.out.println("Keys: "+itrk.next());
		}
		
		Iterator itrv=tm.values().iterator();
		while(itrv.hasNext())
		{
			System.out.println("Values: "+itrv.next());
		}

	}

}
