package excepation.handling;

public class LowAccountBalance extends Exception
{
	double accountbalance;
	
	public LowAccountBalance() 
	{
		System.out.println("Your account balance low...");
	}
}
