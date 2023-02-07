package collection.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DublicatesFInding 
{
	public static void main(String[] args)
	{
		String name="saravanaprakash";
		char[] names=name.toCharArray();
		HashMap<Character,Integer> values=new HashMap<>();
		
		for (char ch:names)
		{
			if(values.containsKey(ch))
			{
				values.put(ch,values.get(ch)+1);
			}
			else
			{
				values.put(ch, 1);
			}
		}
		System.out.println("count character ="+values);
		Set<Map.Entry<Character, Integer>> dublicates=values.entrySet();
		for (Map.Entry<Character, Integer> entry:dublicates)
		{
			if (entry.getValue()>1) 
			{
				System.out.println(entry.getKey()+"\t"+entry.getValue());
			}
		}
	}
}
