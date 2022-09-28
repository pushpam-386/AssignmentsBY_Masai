package com.push.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.push.exception.EmployeeException;
import com.push.model.Employee;
import com.push.model.EmployeeDTO;
import com.push.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceInterface employeeService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) throws EmployeeException{
		Employee employee=employeeService.registerEmployee(emp);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@GetMapping("/byid{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer id) throws EmployeeException{
		Employee employee=employeeService.getEmployeeById(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/details")
	public ResponseEntity<List<Employee>> getAllEmployeedetails() throws EmployeeException{
		List<Employee> employee=employeeService.getAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(employee,HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/delete{id}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable Integer id) throws EmployeeException{
		Employee employee=employeeService.deleteEmployeeById(id);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.BAD_REQUEST);
		
	}
	
	
	@GetMapping("/update")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Employee emp) throws EmployeeException{
		Employee employee=employeeService.updateEmployee(emp);
		
		return new ResponseEntity<Employee>(employee,HttpStatus.NOT_MODIFIED);
		
	}
	
	
	@GetMapping("/detailsbyAddress{add}")
	public ResponseEntity<List<Employee>> getEmployeeByAddress(@PathVariable String address) throws EmployeeException{
		List<Employee> employees=employeeService.getEmployeeDetailsByAddress(address);
		
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.NOT_FOUND);
	
	}
	
	@GetMapping("/detailsofall")
	public ResponseEntity<List<EmployeeDTO>> getNameAndAddressAndSalaryofAllEmpoyee() throws EmployeeException{
		List<EmployeeDTO> employees=employeeService.getNameAddressSalaryOfAllEmployee();
		
		return new ResponseEntity<List<EmployeeDTO>>(employees,HttpStatus.NO_CONTENT);
	
	}
	
	
	@GetMapping("/nameaddbyid{id}")
	public ResponseEntity<String[]> getNameAndAddressAndSalaryofAllEmpoyee(@PathVariable Integer id) throws EmployeeException{
		String[] employeesstr=employeeService.getNameAndAddressOfEmplyeeById(id);
		
		return new ResponseEntity<>(employeesstr,HttpStatus.BAD_REQUEST);
	
	}
}
