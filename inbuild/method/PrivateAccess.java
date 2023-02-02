package inbuild.method;

public class PrivateAccess 
{
	private void name()
	{
		System.out.println("Arunkumar");
	}
	private int age;
	private String place; 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setplace(String place)
	{
		this.place=place;
	}
	public String getplace()
	{
		return place;
	}
}
