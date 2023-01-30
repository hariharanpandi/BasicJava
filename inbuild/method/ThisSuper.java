package inbuild.method;

public class ThisSuper extends FamilyDetails
{
	public ThisSuper()
	{
		System.out.println("Members List");
	}
	public static void main (String []args)
	{
		ThisSuper ts=new ThisSuper();
		FamilyDetails fd=new FamilyDetails("pandi","santha");
	}
}
