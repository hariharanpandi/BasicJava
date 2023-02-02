package string;

public class NameChange 
{
	public static void main (String []args)
	{
		String s="hariharan";
		char ss[]=new char [15];
		for (int i=0;i<s.length();i++)			
		{
			int j=0;
			while (j<ss.length)
			{
				if (s.charAt(i)=='a')
				{
					ss[j]=s.charAt(i);
					j++;
					break;
				}
				else
				{
					ss[j]=s.charAt(i);
					j++;
					break;
				}
			}
		}
		for (char output:ss)
		{
			System.out.print(output);
		}
	}
}
