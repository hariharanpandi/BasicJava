package trainee_time;
public class Frequency 
{
	public static void main(String []args)
	{
		int arr[]= {32,34,45,45,32,21,12,12,122,122,76,89,90};
		int freq[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if (key==arr[j])
				{
					count++;
					freq[j]=-1;
				}
			}
			if (freq[i]!=-1)
				freq[i]=count;
		}
		for (int i=0;i<arr.length;i++)
		{
			if (freq[i]>0)
				System.out.println(arr[i]+" "+freq[i]);
		}
	}
}
