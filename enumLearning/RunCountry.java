package enumLearning;

public class RunCountry 
{
	public static void main (String []args)
	{
		Country[] country=Country.values();
		
		for (int i=0; i<country.length;i++)
		{
			System.out.println(country[i]+"---->"+country[i].ordinal());
		}
	}
}
