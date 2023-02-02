package string;

public class Operator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=15;
		
		String s=a>b?"true":"false";
		System.out.println(s);
		

		String s1="hii";
		String s2="bye";
		String ss=a>=b?s1:s2;
		System.out.println(ss);
		
		int sss=a>b?a+b:b-a;
		System.out.println(sss);
	}
}
