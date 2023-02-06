package array.Class.Methods;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayMobile
{
	public static void main (String []args)
	{
		//length wise ascending descending
		
		String []mobile= {"samsung","vivo","oppo","redmi"};
		
		
		Comparator<Object> com=new ComparDemo();
		Arrays.sort(mobile,com);
		
		
		for(String ss:mobile)
		{
			System.out.println(ss);
		}
			
		
	}
}
