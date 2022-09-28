package com.push.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.push.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{
	public List<Employee> findByAddress(String address);
	public List<Employee> findByNameAndAddress(Integer empId); 
	public List<Employee> findByNameAndAddressAndSalary();
	
}
