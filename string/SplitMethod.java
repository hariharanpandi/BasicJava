package string;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SplitMethod 
{
	public static void main(String []args)
	{
		String sentence="abcdefgh abcdefgh ijklmneopqrs tuvwxyz";
		String []s=sentence.split("\\s");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println();
		
		Pattern p=Pattern.compile("\\s");
		String []ss=p.split(sentence);
		
		for (String sss:ss)
		{
			System.out.println(sss);
		}
		
		
	}
}
