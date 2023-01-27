package binding;

public abstract  class Manager extends Employee
{
    public void work()
	{
    	System.out.println("emp developer");
	}
	@Override
	public void empid()
	{
		System.out.println("empid 1234");
	}
	public void empplace()
	{
		System.out.println("working in coimbatore");
	}
	@Override
	public void job() 
	{
		// TODO Auto-generated method stub
		System.out.println("Developer");
	}
//
//	@Override
//	public void managername() 
//	{
//		// TODO Auto-generated method stub
//		System.out.println("praveen");
//	}
}
