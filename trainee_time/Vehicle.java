package trainee_time;

public class Vehicle implements Interface_program 
{
	public void bike()
	{
		System.out.println("RC200");
		price();
	}
	public void train()
	{
		System.out.println("Vaigai Express");
		price();
	}
	public void flight()
	{
		System.out.println("Air India");
		price();
	}
	public void car()
	{
		System.out.println("Suzuki");
		price();
	}
	public static void price()
	{
		int i=100000;
		System.out.println("vehicle Price "+amt+i);
		System.out.println();
	}
	public static void main(String []args)
	{
		Vehicle v=new Vehicle();
		v.car();
		v.bike();
		v.flight();
		v.train();
	}
}
