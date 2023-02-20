package newFeatures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class PrintUsingLogger {
	private String empname;
	private String id;
	private String role;

	public PrintUsingLogger(String empname, String id, String role) {
		this.empname = empname;
		this.id = id;
		this.role = role;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Logger logger = Logger.getLogger(PrintUsingLogger.class.getName());
		logger.info("ENTER THE EMPLOYEE NAME");
		String empname = scanner.next();
		logger.info("ENTER THE EMPLOYEE ID");
		String id = scanner.next();
		logger.info("ENTER THE EMPLOYEE DESIGINATION");
		String role = scanner.next();
		PrintUsingLogger aa = new PrintUsingLogger(empname, id, role);
		ArrayList<Object> name = new ArrayList<>();
		name.add("hello");
		name.add(aa.toString());
		String values = name.toString();
		logger.info(values);
		scanner.close();
	}

	public String toString() {
		return empname + " : " + id + " : " + role;

	}
}
