package enumtask;

import java.util.ArrayList;

public enum Salary {
HARI("A",1000,5000);

public String grade;
public int maxSalary;
public int minSalary;

Salary(String grade, int minSalary, int maxSalary) {
this.grade=grade;
this.maxSalary=maxSalary;
this.minSalary=minSalary;
}
public static void main(String[] args) {
	ArrayList arr=new ArrayList();
	arr.add(new SalaryExceptionEnum("hari","A",1000));
}
}