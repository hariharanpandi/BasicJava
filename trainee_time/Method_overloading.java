package trainee_time;

public class Method_overloading 
{
	public void lion()
	{
		System.out.println("Lion");
	}
	public void tiger()
	{
		System.out.print("Tiger");
	}
	public static void main (String []args)
	{
		Method_overloading o=new Method_overloading();
		o.lion();
		o.tiger();
	}
	
}
