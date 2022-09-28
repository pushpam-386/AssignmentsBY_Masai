package table.classs;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	@Id
	private int empID;
	private String name;
	private String address;
	private int salary;
	
	public Employee(int empID, String name, String address, int salary) {
	
		this.empID = empID;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public Employee() {
	
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
	

}
