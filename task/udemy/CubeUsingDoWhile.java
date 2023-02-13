package task.udemy;

import java.util.Scanner;

public class CubeUsingDoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number");
			number = scanner.nextInt();
			if (number > 0)
				System.out.println("Cube is = " + (number * number * number));
		} while (number >= 0);
		System.out.println("Thanks, Have a fun !");
		scanner.close();
	}
}
