package array.Class.Methods;

import java.util.Arrays;
import java.util.Collections;

public class StringAscending 
{
	public static void main (String []args)
	{
		String []ss= {"Hello","Bye","Welcome","GoodMorning"};
		
		int []no= {1,2,23,23,12,1,5,90};
		Arrays.sort(ss,Collections.reverseOrder());
		Arrays .sort(ss);
		
		System.out.println(Arrays.toString(ss));
		
		
		int a=5;
		int b=10;
		int c=Math.addExact(a, b);
		 System.out.println(c);
		
		
	}
}
