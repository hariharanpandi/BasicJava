package collection.sample;

public class Mobile {

	 String model;
	 int price;
	 int ram;
	 int rom;

	public Mobile(String model, int price, int ram, int rom) 
	{
		this.model=model;
		this.price=price;
		this.ram=ram;
		this.rom=rom;
		
	}
	public String toString()
	{
		return this.model+" : "+this.price+" : "+this.ram+" : "+this.rom;
	}
}
