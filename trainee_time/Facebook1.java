package trainee_time;

public class Facebook1 extends Abstraction
{
	public void like()
	{
		System.out.println("LIKE....");
	}
	public static void main (String []args)
	{
		Facebook1 f1=new Facebook1();
		f1.like();
		f1.heart();
	}
}
