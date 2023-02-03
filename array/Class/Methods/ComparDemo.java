package array.Class.Methods;

import java.util.Comparator;

public class ComparDemo implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=(String)o1;	  	//type casting
		String s2=o2.toString();    //type casting
		
		if (s1.length() > s2.length())       
			return +1;
		else if (s1.length()<s2.length())
			return -1;
		else
			return 0;
	}

}