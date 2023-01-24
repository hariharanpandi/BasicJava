package modelTask;

public class task3 
{
	public static void main (String []args)
	{
		int row=5;
		int no1=2;
		int no2=1;
		int i=1;
		while (i<=row)
		{
			int j=1;
			while(j<=i)
			{
				if (i%2==0)
				{
					if (no1%2==0)
					{
						System.out.print(no1+" ");
						no1=no1+2;
					}
					else
					{
					System.out.print(no1+" ");
					no1=no1+2;
					}
				}
				else
				{
					if (no2%2==0)
					{
						System.out.print(no2+" ");
						no2=no2+2;
					}
					else
					{
						System.out.print(no2+" ");
						no2=no2+2;
					}
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
