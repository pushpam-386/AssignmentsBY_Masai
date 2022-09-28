package com.push.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.push.exception.EmployeeException;
import com.push.model.Employee;
import com.push.model.EmployeeDTO;
import com.push.repo.EmployeeDao;

@Service
public class EmployeeServiceImplementation implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	
	
	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {
		
		Employee employee=employeeDao.save(emp);
		
		if (employee!=null) {
			return employee;
		}
		else {
			throw new EmployeeException("Employee Not Registered");
		}
	}
	

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		Employee employee=employeeDao.findById(empId).orElseThrow(()-> new EmployeeException("Employee By this id not found"+empId));
		
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {
		
		List<Employee> employee=employeeDao.findAll();
		
		if (employee.isEmpty()) {
			throw new EmployeeException("No Employee Details Found");
		}
		else {
			return employee;
		}
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {
		
		Employee employee=employeeDao.findById(empId).orElseThrow(()-> new EmployeeException("Employee By this id not found"+empId));
		
		if (employee!=null) {
			employeeDao.delete(employee);
		}
		else {
			throw new EmployeeException("No Employee Found to Delete");
		}
		
		return employee;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {
		List<Employee> eList=employeeDao.findByAddress(address);
		
		if (eList.isEmpty()) {
			throw new EmployeeException("NO Details Found By Address");
		}
		else {
			return eList;
		}
		
	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {
		
		Optional<Employee> optional=employeeDao.findById(emp.getEmpId());
		
		if (optional.isPresent()) {
			Employee employee=optional.get();
			
			employeeDao.save(employee);
		}
		else {
			throw new EmployeeException("Employee Not Found to Update");
		}
		return emp;
	}

	@Override
	public String[] getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		List<Employee> employees=employeeDao.findByNameAndAddress(empId);
		
		String[] str=new String[1000];
		int c=0;
		for (Employee employee : employees) {
			str[c]=employee.getAddress()+" "+employee.getEmpName();
		
		}
		if (employees.isEmpty()) {
			throw new EmployeeException("NO Nmae and adress Found By empId");
		}
		else {
			return str;
		}
		
		
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {
		List<Employee> employees=employeeDao.findByNameAndAddressAndSalary();
		
		List<EmployeeDTO> employeeDTOs=new ArrayList<>();
		for (Employee employee : employees) {
			EmployeeDTO employeeDTO=new EmployeeDTO(employee.getEmpName(),employee.getAddress(),employee.getSalary());
			
			employeeDTOs.add(employeeDTO);
		}
		if (!employeeDTOs.isEmpty()) {
			return employeeDTOs;
		}
		else {
			throw new EmployeeException("No Entry Found");
		}
		
		
	}
	
	


}
