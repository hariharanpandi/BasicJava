package excepation.handling;

import java.util.Scanner;

public class Accounts 
{
	final static double mimimumbalance=500;

	public static void main (String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		double accountbalance=1000;
		double withdrawamount=scanner.nextDouble();
		withdraw(withdrawamount, accountbalance);
		scanner.close();
	}

	private static void withdraw(double withdrawamount, double accountbalance) 
	{
		if (accountbalance>=withdrawamount)
		{
			accountbalance=accountbalance-withdrawamount;
			System.out.println("Withdraw Amount   "+withdrawamount+"\n"+"balance   "+accountbalance);
		}
		else
		{
			try 
			{
				throw new LowAccountBalance();
			}
			catch(Exception exeception)
			{
				System.out.println("visit your branch");
			}
		}
	}
}
