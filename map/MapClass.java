package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapClass
{
	public static void main(String[] args) 
	{
		HashMap<Object, Object> hashmap=new HashMap<>();
		
		hashmap.put(1001, "Arun");
		hashmap.put(1002, "Bagavathi");
		hashmap.put(1003, "chandhuru");
		hashmap.put(1004, "dhanaseaker");
		
		System.out.println(hashmap);
		Set<Object> set=hashmap.keySet();
		System.out.println(set);	
		Collection<Object> values=hashmap.values();
		System.out.println(values);
		
		Set<Entry<Object, Object>> entry =hashmap.entrySet();
		System.out.println(entry);
		Iterator<Entry<Object, Object>> i=entry.iterator();
		while (i.hasNext())
		{
			Map.Entry<Object,Object> mapentry=i.next();
			if (mapentry.getKey().equals(1001)) 
				mapentry.setValue("hari");
			System.out.println(mapentry);
		}
		
	
	}

}
