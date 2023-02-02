package trainee_time;

import java.util.Scanner;

public class forloop 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int arr[]=new int[length];
	    
	    for (int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    
	    for (int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }

	}
}
