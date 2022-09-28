package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelperController {  //root resource
	
	@RequestMapping("/hello")
	public String getWelcomeMessage() {  //resource
		
		return "Welcome to Spring Boot";
		
	}
	
	
	@RequestMapping("/employee")
	public Employee getemployee() {  //resource
		
		Employee employee=new Employee(7,"Pushpam","Ramnagri");
		
		return employee;
		
	}
	
	@RequestMapping("/employees")
	public List<Employee> getemployeeDetaiList() {  //resource
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(7,"Pushpam","Ramnagri"));
		employees.add(new Employee(8,"Deepak","Ramnagar"));
		employees.add(new Employee(9,"Sunita","Ashiyana"));
		
		return employees;
		
	}
	
	

}
