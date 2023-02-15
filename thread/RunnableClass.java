package thread;
class Parent implements Runnable{
	public void run() {
		System.out.println("Hello Java");
	}
}
class Student extends Thread{
	public void run() {
		System.out.println("Hello SpringBoot");
	}
}
public class RunnableClass {
	public static void main(String[] args) {
		
		
		Runnable parent=new Parent();
		Thread thread=new Thread(parent);
		thread.start(); 
		Student student=new Student();
		student.start();
		System.out.println("Hello Python");
	}
}
