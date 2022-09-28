package com.push.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.push.exception.EmployeeException;
import com.push.model.Employee;
import com.push.model.EmployeeDTO;

@Service
public interface EmployeeServiceInterface {
	
	public Employee registerEmployee(Employee emp)throws EmployeeException;
	public Employee getEmployeeById(Integer empId)throws EmployeeException;
	public List<Employee> getAllEmployeeDetails()throws EmployeeException;
	public Employee deleteEmployeeById(Integer empId)throws EmployeeException;
	public List<Employee> getEmployeeDetailsByAddress(String address)throws EmployeeException;
	public Employee updateEmployee(Employee emp)throws EmployeeException;
	public String[] getNameAndAddressOfEmplyeeById(Integer empId)throws EmployeeException;
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee()throws EmployeeException;

	
	
	

}
