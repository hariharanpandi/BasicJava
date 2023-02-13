package thread;

public class SingleThread extends Thread
{
	public static void main(String[] args) 
	{
		SingleThread singleThread= new SingleThread();
		singleThread.start();
		for (int i = 0;i<5;i++) 
		{
			System.out.println("Main Method >>> ");
		}
		}

	public void run() 
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println("Run Method >>> ");
		}
	}
}