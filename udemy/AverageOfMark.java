package task.udemy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class AverageOfMark {
	public static void main(String[] args) {
		int[] mark = { 47, 98, 77 };
		int sum = getsum(mark);
		BigDecimal getaverage = AverageOfMark.getaveragemark(sum);
		System.out.println("Student Mark = "+Arrays.toString(mark)+"\nTotal Marks = "+sum+"\nAvarage Of Mark = "+getaverage);
	}

	private static int getsum(int[] mark) {
		int sum = 0;
		for (int marks : mark) {
			sum = sum + marks;
		}
		return sum;
	}

	private static BigDecimal getaveragemark(int sum) {
		int number = 3;
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}
}
