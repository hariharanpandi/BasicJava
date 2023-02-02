package array.Class.Methods;

import java.util.Comparator;

public class compareAlphabet implements Comparator 
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		String s1=(String)o1;
		String s2=o1.toString();
		
		int same =s1.compareTo(s2);
		if (same>0)
			return 1;
		else if (same<0)
			return -1;
		else 
			return 0;
	}
 
}
