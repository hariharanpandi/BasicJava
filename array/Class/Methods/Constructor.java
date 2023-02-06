package array.Class.Methods;

public class Constructor 
{
	int total;
	public void mannar(int amt)
	{
		System.out.print("good afternoon"+amt);
	    total=total+amt;
	}
	
    private Constructor(int i)
	{
		System.out.println("good morning"+i);
		
	}
	
	public static void main (String[]hari)
	{
		Constructor cc=new Constructor(20);
		cc.mannar(50);
	}
}
