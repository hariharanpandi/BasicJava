package enumtask;

import java.util.ArrayList;

public class MainExceptionRunner {
	public static void main(String[] args){
		ArrayList<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("AT001", "Suresh", "GradeA", 6000));
		employeeList.add(new Employee("AT002", "Arun", "GradeB", 11000));
		employeeList.add(new Employee("AT003", "hari", "GradeC", 5000));

		Employeenum[] employeeArray = Employeenum.values();

		for (Employee empValue : employeeList) {
			boolean bool = false;
			for (Employeenum myEnum : employeeArray) {

				if (empValue.getGrade().equalsIgnoreCase(myEnum.getGrade())
						&& (empValue.getSalary() <= myEnum.getMaxSalary()
								&& empValue.getSalary() >= myEnum.getMinSalary())) {
					bool = true;
				}
			}
			try {
			if (bool) {
				System.out.println( "equal");
			} else {
				throw new MyRuntimeException("Invalid Grade/Salary");
			}
			}catch (Exception exception)
			{
				System.err.println(exception.getMessage());
			}

		}

	}
}
