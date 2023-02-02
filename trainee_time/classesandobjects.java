package trainee_time;

class box
{
	int height;
	int width;
}
public class classesandobjects 
{
	public static void main(String []args)
	{
		box blackbox=new box();
		box whitebox=new box();
		
		blackbox.height=20;
		whitebox.height=30;
		
		System.out.println("blackbox height ="+blackbox.height);
		System.out.println("whitebox height ="+whitebox.height);
	}
}
