package trainee_time;

public class Casting 
{
	public static void main(String[] args) 
	{
		// data type casting 
		//widening 
		int a=10;   
		System.out.println(a);//10
		long b=a;			  
		System.out.println(b);//10
		float c=b;			  
		System.out.println(c);//10.0
		
		short e=2;
		int w=e;
		
		//narrowing
		int f=12;
		short d=(short)f;
		System.out.println(d);//12
		
		double q=10.99;
		System.out.println(q);//10.99
		int r=(int)q;
		System.out.println(r);//10
	}
}
