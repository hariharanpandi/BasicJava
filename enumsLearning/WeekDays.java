package enumsLearning;

public class WeekDays 
{
	Days day;
	public WeekDays(Days day) 
	{
		this.day=day;
	}
	public void weeks()
	{
		switch(day)
		{
		case MONDAY:
			System.out.println("Very bad day");
			break;
		case TUESDAY:
			System.out.println("Bad day");
			break;
		}
	}
	public static void main(String []args)
	{
		WeekDays firstday=new WeekDays (Days.MONDAY);
		firstday.weeks();
		WeekDays secound=new WeekDays (Days.TUESDAY);
		secound.weeks();
	}
}
