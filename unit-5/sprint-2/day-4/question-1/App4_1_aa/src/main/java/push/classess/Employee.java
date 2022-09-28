package push.classess;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Employee extends Person{
	
	@ElementCollection
	@Embedded
	private Address homeAddress;
	
	@ElementCollection
	@Embedded
	private Address officeAddress;
	private int salary;
	
	
	public Employee(int pid, String name, Address homeAddress, Address officeAddress, int salary) {
		super(pid, name);
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
		this.salary = salary;
	}
	public Employee(int pid, String name) {
		super(pid, name);
	}
	
	
	public Employee() {
		
	}
	
	@Override
	public String toString() {
		return "Employee [homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + ", salary=" + salary + "]";
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
