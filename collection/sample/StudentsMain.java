package collection.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentsMain 
{
	public static void main(String []args)
	{
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(new Students("hari",12,12));
		al.add(new Students("arun",12,13));
		al.add(new Students("sridhar",12,12)); 
		
		System.out.println(al);
		
		ArrayList<Object> al1=new ArrayList<Object>();
		al1.addAll(al);
		
		Comparator<Object> ss=new Compare();
		Collections.sort(al,ss);
		
		System.out.println(al);
		
	}
}
