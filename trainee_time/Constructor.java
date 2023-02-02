package trainee_time;

public class Constructor 
{
	public static void main(String []args)
	{
		
		Cons_1 s1=new Cons_1("Praveen","z4567",98,89);
		Cons_1 s2=new Cons_1("Rahul","z4568",98,89);
		Cons_1 s3=new Cons_1("Karthick Pandi","z4569",98,89);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Name \t\tId \t\tmark1 \t\tmark2 ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(s1.name +"\t\t"+s1.id+"\t\t"+s1.mark1+"\t\t"+s1.mark2);
		System.out.println(s2.name +"\t\t"+s2.id+"\t\t"+s2.mark1+"\t\t"+s2.mark2);
		System.out.println(s3.name +"\t"+s3.id+"\t\t"+s3.mark1+"\t\t"+s3.mark2);
	}
}
