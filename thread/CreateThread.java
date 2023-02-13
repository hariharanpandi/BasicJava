package thread;

public class CreateThread extends Thread
{
	public void display()
	{
		run();
	}
	public void run()
	{
		System.out.println("CreateThread run() ");
	}
}
