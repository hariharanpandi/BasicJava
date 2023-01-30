package inbuild.method;

public class FamilyDetails 
{
	public FamilyDetails()
	{
		System.out.println("WELCOME TO MY HOME");
	}
	public FamilyDetails(int familyCount)
	{
		this();
		System.out.println("Family Count = "+familyCount);
	}
	public FamilyDetails(String member1, String member2)
	{
		this(2);
		System.out.println("Family Members List");
		System.out.println("1) "+member1);
		System.out.println("2) "+member2);
	}
}
