package thread;

class Cycle extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();

		}
		System.out.println("I got Cycle");
	}
}

class Bike extends Thread {
	@Override
	public void run() {
		System.out.println("I got a Bike");
	}
}

public class Vehicle {
	public static void main(String[] args) {
		Cycle cycle = new Cycle();
		cycle.start();
		/*
		 * anonymous class
		 */
		Bike bike = new Bike() {
			@Override
			public void run() {
				System.out.println("I got a bike RC200");
			}
		};
		bike.start();
		System.out.println("Walk and go");
	}
}
