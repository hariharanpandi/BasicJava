package collection.sample;

public class Students
{
	String name;
	int m1;
	int m2;
	
	public Students(String name, int i, int j) 
	{
		this.name=name;
		this.m1=i;
		this.m2=j;
	}
	public String toString()
	{
		return this.name+" : "+this.m1+" : "+this.m2;
	}
}
