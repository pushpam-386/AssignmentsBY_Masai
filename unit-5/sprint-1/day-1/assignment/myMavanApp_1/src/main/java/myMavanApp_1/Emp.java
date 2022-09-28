package myMavanApp_1;

public class Emp {
	private int e_id;
	private String name;
	private String address;
	private float salary;
	public Emp() {
	
	}
	public Emp(int e_id, String name, String address, float salary) {
		super();
		this.e_id = e_id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public int getE_id() {
		return e_id;
	}
	public void setE_id(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	

}
