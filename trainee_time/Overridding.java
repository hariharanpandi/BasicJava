package trainee_time;

public class Overridding extends Method_overloading
{
	@Override
	public void lion()
	{
		System.out.println("...Lion...");
	}
	public static void main(String []args)
	{
		Overridding o=new Overridding();
		o.lion();
		o.lion();
	}
	
}
