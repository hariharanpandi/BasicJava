package trainee_time;
import java.util.*;
public class twodimensional 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the array length");
		int length=sc.nextInt();
		int []arr=new int[length];
		
		System.out.println("enter the "+length+" array values");
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=Integer.MIN_VALUE,secound=Integer.MIN_VALUE,min=Integer.MIN_VALUE;
		
		int i=0;
		while(i<arr.length)
		{
			if(max<arr[i])
			{
				min=secound;
				secound=max;
				max=arr[i];
		}
			else if (secound<arr[i])
			{
				min=secound;
				secound=arr[i];
			}
			else if (min<arr[i])
				min=arr[i];
			i++;
		}
		System.out.println(max);
		System.out.println(secound);
		System.out.println(min);
	}
}
