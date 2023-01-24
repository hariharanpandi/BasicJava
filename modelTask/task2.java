package modelTask;

import java.util.*;
public class task2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array length");
	    int length=sc.nextInt();
	    int arr[]=new int[length];
	    
	    System.out.println("Enter the "+length+" array values");
	    for (int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
//	    
//	    System.out.println("printing array");
//	    for (int i=0;i<arr.length;i++)
//	    {
//	    	System.out.println(arr[i]);
//	    }
	    System.out.println();
	    for (int i=0;i<arr.length;i++)
	    {
	    	if (arr[i]==2)
	    	{
	    		System.out.println("condition true");
	    	}
	    	if (arr[i]!=5)
	    	{
	    		System.out.println("condition true");
	    	}
	    	if (arr[i]!=5 && arr[i]>= 5)
	    	{
	    		System.out.println("condition true");
	    	}
	    	if (arr[i]!= 0 || arr[i]==2)
	    	{
	    		System.out.println("condition true");
	    	}
	    	if (!(arr[i]<10))
	    	{
	    		System.out.println("condition true");
	    	}
	    }
	}
}
