package trainee_time;
import java.util.*;
public class Calculater 
{
	
	public static void add(double a,double b)
	{
		 double c=a+b;
		 System.out.println(c);
	}
	public static void sub(double a,double b)
	{
		 double c=a-b;
		 System.out.println(c);
	}
	public static void multi(double a,double b)
	{
		 double c=a*b;
		 System.out.println(c);
	}
	public static void divi(double a,double b)
	{
		 double c=a/b;
		 System.out.println(c);
	}
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Operator");
		char option=sc.next().charAt(0);
		System.out.print(" Enter two values");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c;
		switch (option)
		{
		case '+':add(a,b);
				 break;
		case '-':sub(a,b);
				 break;
		case '*':multi(a,b);
				 break;
		case '/':divi(a,b);
				 break;
		default :System.out.println("Invalid Operator");
		}
	}
}
