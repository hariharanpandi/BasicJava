package trainee_time;

import java.util.Scanner;

public class Arraylearning 
{
	public static void main (String []args)
	{
		Scanner scanner=new Scanner(System.in);
		int[] arr=new int[5];
		
		for(int i=0;i<=arr.length;i++)
		{
			System.out.print("Enter the number : ");
			try {
				arr[i]=scanner.nextInt();	
			}
			catch(ArrayIndexOutOfBoundsException nfe)
			{
				System.out.println("hello ");
			}
		}
		System.out.println("numbers are...");
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
