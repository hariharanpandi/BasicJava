package string;

public class StrinngBuffer 
{
	public static void main(String[] args) 
	{
		String []name={"hariharan","arunkumar","sridhar","prakash"};	
		StringBuffer sb=new StringBuffer("");		
		for (String s:name)
		{
			//adding at the end position
			sb.append(name);
			System.out.println(s);
		}
		
		String name1="hariharan";
		StringBuffer sb1=new StringBuffer(name1);
		//insert
		sb1.insert(0, "p ");
		System.out.println(sb1);
		
		String name2="harikaran";
		StringBuffer sb2=new StringBuffer(name2);
		//Repace char
		sb2.replace(4,5, "h");
		System.out.println(sb2);
		
		//reverse print
		System.out.println(sb2.reverse());
	}
}
