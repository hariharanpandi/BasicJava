package array.Class.Methods;

import java.util.Arrays;

public class ArraySort 
{
	public static void main(String []args)
	{
		String[] s= {"Java","Spring boot","Html","Sql"};
		
		int []i= {1,2,5,3,4,7,8,1};
		//Sorting 
		Arrays.sort(i);
		for (int j:i)
		{
			System.out.println(j);
		}
		//String Sorting 
		Arrays.sort(s);
		for (String t:s)
		{
			System.out.println(t);
		}
	}
}
