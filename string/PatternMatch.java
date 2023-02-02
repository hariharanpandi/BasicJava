package string;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternMatch 
{
	public static void main(String []args)
	{
		String sentence="thuppaku thuppaya thuppaki thuppaku thuppaya thuvum malai";
		
		Pattern p= Pattern.compile("thuppaya");
		Matcher m=p.matcher(sentence);
		
		while (m.find())
		{
		System.out.println(m.group());
		}
		
	}
}
