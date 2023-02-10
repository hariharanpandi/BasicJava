package enumtask;

public enum Country 
{
	INR("INDIA","INR","$"),USA("USA","USD","S"),EUR("EUROPE","EUR","U");

	String country,rupee,symbols;
	Country(String country, String rupee, String symbols) 
	{
		
			this.country=country;
			this.rupee=rupee;
			this.symbols=symbols;
	}
}
