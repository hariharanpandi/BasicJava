package wrapperClass;

public class WrapperClassCreate 
{
	public static void main(String []args)
	{
		int a=5;   						 //Primitive data
		
		Integer b= Integer.valueOf(20);  // Boxing 
		int c=b.intValue();				 // Unboxing
		
		Integer d=12;					 //Auto Boxing
		int f=d;						 //Auto Unboxing
		
		String no="7904";
		
		//int mob=s;                  we will get error
		int mobile=Integer.parseInt(no);
		System.out.println(mobile);
	}
	
}
