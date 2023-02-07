package collection.sample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCounting 
{
	public static void main(String[] args)
	{
		String name="Aaludra Techonologies saravanampatti road coimbatore - 004 004";
		wordcount(name);
		
	}

	public static void wordcount(String name) 
	{
		String[] names=name.split(" ");
		
		HashMap<String, Integer> wordcount=new HashMap<>();
		for (String word:names)
		{
			if (wordcount.containsKey(word))
			{
				 wordcount.put(word,wordcount.get(word)+1);
			}
			else
			{
				wordcount.put(word, 1);
			}
		}
		Set<Map.Entry<String, Integer>> mapcount =wordcount.entrySet();
		for(Map.Entry<String, Integer> result:mapcount)
		{
			System.out.println(result);
		}
	}
}