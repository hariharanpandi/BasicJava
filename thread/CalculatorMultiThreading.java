package thread;

import java.util.Scanner;

public class CalculatorMultiThreading extends Thread {
	public CalculatorMultiThreading() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Two Values");
		int number1=scanner.nextInt();
		int number2=scanner.nextInt();
		add(number1, number2);
		scanner.close();
	}
	public void add(int number1, int number2){
		int sum=number1+number2;
		System.out.println(sum);
		sub(number1,number2);
	}
	public void sub(int number1,int number2) {
		int sub=number1-number2;
		System.out.println(sub);
		multiply(number1,number2);
	}
	public void multiply(int number1, int number2){
		int sum=number1*number2;
		System.out.println(sum);
		division(number1,number2);
	}
	public void division (int number1,int number2) {
		int sub=number1/number2;
		System.out.println(sub);
	}
}
