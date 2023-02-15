package enumsLearning;

public enum Types 
{
	AJITH(50),VIJAY(50),SURYA(45);
	int salary;
	Types (int salary)
	{
		this.salary=salary;
	}
	public void act(int salary)
	{
		System.out.println("Actors"+salary);
	}
	public void main(String []args)
	{
		AJITH.act(salary);
	}
}