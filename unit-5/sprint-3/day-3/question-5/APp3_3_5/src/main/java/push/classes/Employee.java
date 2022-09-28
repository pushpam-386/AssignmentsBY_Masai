package push.classes;

public class Employee {

	private int empId;
	private String empName;
	private String address;
	private int salary;
	
	private Department department;
	
	
	
	public Department getDepartment() {
		return department;
	}
	
	


	public void setDepartment(Department department) {
		this.department = department;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				+ "]";
	}


	public Employee() {
		super();
	}


	public Employee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getAddress() {
		return address;
	}
	public int getSalary() {
		return salary;
	}
	
	
	

}
