package modelTask;
//If Condition
//
//A shop will give discount of 10% if the cost of purchased quantity is 
//more than 1000.
//Ask user for quantity Suppose, one unit will cost 100.Judge and print 
//total cost for user.

import java.util.*;
public class task1 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		
		double fixdis=1000;
		double oneUnit=100;
		System.out.print("Enter the unit :");
		
		double userunit=sc.nextDouble();
		double totalAmt=userunit*oneUnit;
		
		if (fixdis<totalAmt)
		{
			double discount=totalAmt*0.10;
			System.out.println("Purchase amount = "+totalAmt);
			totalAmt=totalAmt-discount;
			System.out.println("discount amount = "+discount+"\n"+"total Amount = "+totalAmt);
		}
		else
		{
			System.out.println(totalAmt);
		}
	}
}
