package enumtask;
enum Employeenum {
    GRADEA("GradeA", 5000, 10000), GRADEB("GradeB", 11000, 50000), GRADEC("GradeC", 50000, 100000);

private String grade;
private int minSalary;
private int maxSalary;

public String getGrade() {
    return grade;
}

public int getMinSalary() {
    return minSalary;
}

public int getMaxSalary() {
    return maxSalary;
}

Employeenum(String grade, int minSalary, int maxSalary) {
    this.grade = grade;
    this.minSalary = minSalary;
    this.maxSalary = maxSalary;
}
}
public class Employee {
	private String id;
	private String name;
	private String grade;
	private int salary;

	public String getId() {
	    return id;
	}

	public void setId(String id) {
	    this.id = id;
	}

	public String getName() {
	    return name;
	}

	public void setName(String name) {
	    this.name = name;
	}

	public String getGrade() {
	    return grade;
	}

	public void setGrade(String grade) {
	    this.grade = grade;
	}

	public int getSalary() {
	    return salary;
	}

	public void setSalary(int salary) {
	    this.salary = salary;
	}
	public String toString() {
		return this.id+"\t"+this.name+"\t"+this.grade+"\t"+this.salary;
	}

	public Employee(String id, String name, String grade, int salary) {
	    this.id = id;
	    this.name = name;
	    this.grade = grade;
	    this.salary = salary;
	}
	}


