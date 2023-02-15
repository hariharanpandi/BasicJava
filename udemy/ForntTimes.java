package task.udemy;

public class ForntTimes {
	public static String frontTimes(String str, int n) {
		String result = "";
		String string=firstthreeletter(str);
		for (int i = 0; i <= n; i++) {
			result = result + string;
		}
		return result;
	}

	private static String firstthreeletter(String str) {
		String string = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < 3)
				string = "" + str.charAt(i);
		}
		return string;
	}

	public static void main(String[] args) {
		System.out.println(frontTimes("hello", 2));
	}
}
