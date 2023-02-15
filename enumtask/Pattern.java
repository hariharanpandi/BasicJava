package enumtask;

public class Pattern 
{
	public static void main(String[] args) 
	{
		String number="14";
		int i=1;
		int sum=0;
		
		while(i<=10)
		{
			int gt=number.length()-1;
			char lastindex=number.charAt(gt);
			
			if (lastindex %2==0)
				System.out.println(number);
			else 
				System.out.println(sum);
			i++;
		}
	}
}
