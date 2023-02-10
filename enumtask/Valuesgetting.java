package enumtask;

public class Valuesgetting
{
	public static void main(String[] args)
	{
		Country[] rupee =Country.values();
		
		String user="INR";
		for(Country values:rupee)
		{
			if (user.equals(values.symbols))
			{
				System.out.println(values.country);
			}
			else if (user.equals(values.country))
			{
				System.out.println(values.rupee);
			}
			else if (user.equals(values.rupee))	
			{
				System.out.println(values.symbols);
			}
			
		}
	}
}
