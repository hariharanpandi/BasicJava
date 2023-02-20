package newFeatures;

public class ArrayGetFunction {
	private String empname;
	private String id;
	private String role;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayGetFunction(String empname, String id, String role) {
		this.empname = empname;
		this.id = id;
		this.role = role;
	}
}
