package push.classes;

import java.util.List;

import org.springframework.stereotype.Service;


public interface EmployeeService {
		
	public boolean saveEmployee(Employee emp);
	public List getAllEmployee();
	public Employee getEmployeeById(int empId)throws EmployeeException;
	public String deleteEmployeeById(int empId)throws EmployeeException;

}
