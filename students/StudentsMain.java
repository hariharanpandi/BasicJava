package arrayList.comparator.students;

import java.util.ArrayList;

public class StudentsMain 
{
	public static void main(String []args)
	{
		ArrayList al=new ArrayList();
		al.add(new Students("hari",12,12));
		al.add(new Students("arun",12,13));
		al.add(new Students("sridhar",12,12));
		
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);
		
		
		
		
		
	}
}
