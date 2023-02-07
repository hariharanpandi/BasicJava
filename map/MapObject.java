package collection.sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapObject 
{
	public static void main(String[] args) 
	{
		Mobile samsung=new Mobile("M31s",16000,6,128);
		Mobile redmi=new Mobile("note 10 pro",13000,4,128);
		Mobile vivo=new Mobile("vivo5",17000,6,64);
		
		HashMap<Integer, Mobile> objectmap=new HashMap<>();
		objectmap.put(101, samsung);
		objectmap.put(102, redmi);
		objectmap.put(103, vivo);
		
		Set<Entry<Integer, Mobile>> setmap=objectmap.entrySet();
		Iterator<Entry<Integer,Mobile>> change=setmap.iterator();
		while (change.hasNext())
		{
			Map.Entry<Integer, Mobile> mapentry=change.next();
			Object keys=mapentry.getKey();
			Object values=mapentry.getValue();
			Mobile mobile=(Mobile)values;
			if (keys.equals(102))
			{
				mobile.model="jio";
			}
		}
		System.out.println(objectmap);
		
	}
}
