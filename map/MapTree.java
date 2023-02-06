package collection.sample;

import java.util.Map;
import java.util.TreeMap;

public class MapTree 
{
	public static void main (String[] args)
	{
		Map<Object, Object> values=new TreeMap<Object, Object>();
		values.put("101", "siva");
		values.put("102", "karthick");
		values.put("103", "rahul");
		values.put("104", "siva");
		values.put("105", "praveen");
		
		System.out.println(values);
		for (Map.Entry<Object, Object> value:values.entrySet())
		{
			System.out.println(value.getKey()+"\t"+value.getValue());
		}
	}
}
