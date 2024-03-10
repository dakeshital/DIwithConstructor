package SpringDIwithConstructor;

public class Employee {

	private int empId;
	private String empName;
	private String empEmail;

	public Employee(int empId, String empName, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + "]";
	}

}
