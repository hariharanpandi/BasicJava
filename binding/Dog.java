package binding;

public class Dog extends Animal
{
	public  void eat()
	{
		System.out.println("dog is eating");
	}
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		
		Dog b=new Dog();
		b.eat();
		
		Animal c= new Dog();
		c.eat();
	}
}
