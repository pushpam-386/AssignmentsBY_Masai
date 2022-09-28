package com.push;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employe{
	
	@Id
	private int e_Id;
	private String name;
	private String address;
	private int salary;
	
	public Employe() {
	}

	public Employe(int e_Id, String name, String address, int salary) {
		this.e_Id = e_Id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getEmpId() {
		return e_Id;
	}

	public void setEmpId(int empId) {
		this.e_Id = empId;
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
	
	
	
	

}
