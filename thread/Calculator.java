package thread;

public class Calculator {
 public static void main(String[] args) {
	CalculatorMultiThreading calculator=new CalculatorMultiThreading();
	calculator.start();
	System.out.println("Main Method");
}
}
