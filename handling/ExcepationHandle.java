package excepation.handling;

import java.util.Scanner;

public class ExcepationHandle 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int altnumber=scanner.nextInt();
		int addResult=add(number, altnumber);
		int divisionResult=division(number, altnumber);
		int subResult=sub(number,altnumber);
		result(addResult, subResult, divisionResult);
		scanner.close();	
	}
	private static int sub(int number, int altnumber) 
	{
		return number-altnumber;
	}
	private static void result(int addResult, int subResult, int divisionResult) 
	{
		System.out.println("Sum = "+addResult+"\n"+"Sub = "+subResult+"\n"+"Division = "+divisionResult+"\n");
	}
	public static int division(int number, int altnumber) 
	{
		int value = 0;
		try
		{
		value= number/altnumber;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Check values..."+ae.getMessage());
			main(null);
		}
		return value;
	}
	public static int add(int number, int altnumber)
	{
		return number+altnumber;
	}
}