package question_1;

public class Employee3 {
	
	private int e_id;
	private String name;
	private String address;
	private float salary;
	
	public Employee3() {
		
	}
	
	
	public Employee3(int e_id, String name, String address, float salary) {
		this.e_id = e_id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	
	
	
}
