package thread;

public class RunCalling {
	public static void main(String[] args) {
		CreateThread create = new CreateThread();
		create.display();
	}

	public void run() {
		System.out.println("StartThread run()");
	}
}
