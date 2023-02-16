package trainee_time;

public class Dublicates {
public static void main(String[] args) {
	int arr[]= {1,2,1,4,3,6,12,12,3,5,1,5,19};
	int count=1;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if (arr[i]==arr[j])
			{
				count++;
			}
			else
			{
				
			}
		}
		if (count>=2)
		System.out.println(arr[i]+"\t"+count);
		count=1;
	}
}
}
