package string;
import java.util.StringTokenizer;
public class Tokenizer
{
	public static void main (String []args)
	{
		String s="Aaludra Technologies Saravanampatti Road.";
		
		StringTokenizer s1=new StringTokenizer(s);
		while(s1.hasMoreElements())
		{
			System.out.println(s1.nextToken());
		}
		
		System.out.println("------------------------");
		
		StringTokenizer s2=new StringTokenizer(s,".");
		while (s2.hasMoreElements())
		{
			System.out.println(s2.nextToken());
		}
		
		System.out.println("------------------------");
		
		StringTokenizer st=new StringTokenizer(s," ",true);
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}
}
