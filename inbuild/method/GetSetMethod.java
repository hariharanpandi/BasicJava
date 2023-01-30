package inbuild.method;

public class GetSetMethod //extends PrivateAccess
{
	public static void main(String []args) 
	{
		//GetSetMethod pa=new GetSetMethod();
		PrivateAccess pa=new PrivateAccess();
		pa.setAge(23);
		pa.setplace("madurai");
		System.out.println(pa.getplace());
	}
}
