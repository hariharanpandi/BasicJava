package collection.sample;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIterator 
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> students=new HashMap<>();
		students.put(101, "vishnu");
		students.put(102, "siva");
		students.put(103, "Nithiya");
		
		Set<Map.Entry<Integer, String>> studentset=students.entrySet();
		
		System.out.println("Students Roll_No are,"+studentset);
		System.out.println(studentset.size()); 
		
		Iterator<Entry<Integer, String>> student=studentset.iterator();
		while (student.hasNext())
		{
			Map.Entry<Integer, String> mapentry=student.next();
			System.out.println(mapentry.getKey() + "\t"+mapentry.getValue());
		}
	}
}
